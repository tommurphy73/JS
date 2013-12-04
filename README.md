##1.0 Trustev.js
======================

Trustev.js is a secure, server generated JS file repsonsible for gathering details about each session and device that visits your site. Trustev.js can only be used in conjunction with a valid public key.

## 2.0 Integrate Trustev.js
===========================

Phase 1 of integrating Trustev into you site just requires you to add a reference to Trusteev.js  Trustev.js can be integrated into any website within minutes. Trustev.js is a dynamic Javascript library that is repsonsible for determining the trust of any active session on any site, and can either be setup to control the session flow, or hand control back to the site once a trust profile is required.

### 2.1 Trustev.js

To integrate Trustev.js into your website, you need to insert a reference to Trustev.js in your site. To do this, you will need to get your Public Key from <a href="http://trustev.com/Reliance">Trustev Reliance</a>.

Once you have your public key, you can integrate Trustev.js into your site with just one line of code. This line of code must be placed between the opening head tag, and the closing head tag.


     <head>
        <script type=”text/javascript” src=”https://js.trustev.com/v1.1/Trustev.js?key=publickey”></script>
     </head>
	 
You should integrate Trustev.js in every page in your site. Trustev.js collects data about how the customer is using your site, including device information and their interaction with objects on the site. If Trustev.js is not included on every page, we not be able to monitor the customer's behaviour correctly, leading to an incomplete view of the customer and their activity. This can result in an inaccurate Trustev Score.

Next, you'll need to integrate the <a href="https://github.com/Trustev/API">API</a> for Phase 2. Take note of details in this document on how to get the Session Id from the Trustev.js, and also how to validate the JS response.

### 2.2 The Trustev Session Id

For every unique session created by a user or device accessing your site, Trustev generates a Session Id, which you can use during communication with our API. This Trustev Id is exposed as publically accesible Javascript variable, which can be accessed as Trustev.SessionId. If you are reading the Trustev Session Id for any purpose, you should always check the Digital Signature, explained below, to ensure if it is valid.

#### 2.2.1 Digital Signatures

To protect the Trustev Session Id from hijacking, Trustev includes a hashed digital signature, accesible as Trustev.DigitalSignature. This signature is a Sha256Hash, the format of which is explained below. 

<b>If the signature is not valid, then the session has been tampered with. You should immediately reject the session.</b>

The digital signature for the Trustev Session Id is generated in 3 stages. 

##### 2.2.1.1 Stage 1
The first stage of the validation of the Digital Signature is to listen out for a JS hook named TrustevAuthenticationHook(). This hook will be called only when Trustev.js identifies a device or user, and will be called with one argument, which you will use to construct the first portion of the string used to generate the Digital Signature.

The below Javascript function creates the required string for this. If this Javascript function is never hit, simple proceed to Stage 2.

	function TrustevAuthenticationHook(result)
	{
	    var stage1 = "";
	    
	    if (result != null && result.profile != null)
	    {
	        if (result.profile.trustevId != null)
	        {
	            stage1 += result.profile.trustevId.value;
	        }
	        
	        if (result.profile.emailAddress != null)
	        {
	            if (stage1 != null)
	            {
	                stage1 += ".";
	            }
	            stage1 += result.profile.emailAddress.value;
	        }
	        
	        if (stage1 != null)
	        {
	            stage1 = "." + stage1
	        }
	    }
	}

For the purpose of Stage 2, the result of this shall be referred to as [Stage 1].


##### 2.2.1.2 Stage 2

The second stage is to generate a Sha256Hash of the string [Username].[Private Key].[Timestamp].[Stage 1], where [Stage 1] is the result of the Stage 1.

##### 2.2.1.3 Stage 3

The third stage is to generate a Sha256Hash of [Stage 2].[Private Key].[Trustev Session Id], where [Stage 2] is the result of Stage 2.


##### 2.2.1.4 Digital Signature Validation

Once you have created the Sha256Hash in Stage 3, you should compare this to the digital signature. Once the digital signature matches up with the Sha256Hash you have generated, you can safely use the Trustev Session Id.

<b>Note:</b> Your Private Key is available by logging into trustev.com. The private key should never be shared with anybody, or made visible to any one. If you are building the private key into any application, it should not be stored in plain text. If your private key is compromised, Trustev cannot create an accurate Trustev profile for any transaction.
