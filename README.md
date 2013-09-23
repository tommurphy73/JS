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

For every unique session created by a user or device accessing your site, Trustev generates a Session Id, which you can use during communication with our API. This Trustev Id is exposed as publically accesible Javascript variable, which can be accessed as Trustev.SessionId

To protect the Trustev Session Id from hijacking, Trustev includes a hashed digital signature. This signature is a Sha256Hash, the format of which is explained below. If you are reading the Trustev Session Id for any purpose, you should always check the signature to ensure if it is valid.

<b>If the signature is not valid, then the session has been tampered with. You should immediately reject the session.</b>

The digital signature for the Trustev Session Id is generated in 2 stages. The first stage is to generate a Sha256Hash of the string [Username].[Private Key].[Timestamp]. The second stage is to generate aSha256Hash of [Stage 1].[Private Key].[Trustev Session Id], where [Stage 1] is the result of the first Sha256Hash.

Once you have created the Sha256Hash, you should compare this to the digital signature. Once the digital signature matches up with the Sha256Hash you have generated, you can safely use the Trustev Session Id.

<b>Note:</b> Your Private Key is available by logging into trustev.com. The private key should never be shared with anybody, or made visible to any one. If you are building the private key into any application, it should not be stored in plain text. If your private key is compromised, Trustev cannot create an accurate Trustev profile for any transaction.
