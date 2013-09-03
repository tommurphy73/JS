##1.0 API Introduction
======================


### 1.1 Phased Integration

During our initial integration efforts with our early partners, Trustev are promoting a phased integration approach.
This phased approach ensures that your integration with Trustev goes as smoothly as possible, and allows us to
assist with you any issuees prior to go live.


The integration of Trustev into your site is completed using a simple 3 stage process:

<b>Phase 1</b>

Phase 1 involves integrating our simple JS module into your site, and letting this data collection engine 
run for  about 2 weeks. No decisions are made in this phase. This ensures that no JS modules conflict with 
already used libraries, and allows Trustev to get a profile of the type of customer the interacts with your 
site. This data collection helps us to tweak any weightings & thresholds together with you, and ensures 
appropriate scoring when you turn Trustev decisioning on.

<b>Phase 2</b>

Phase 2, which also typically runs for 2 weeks, is our API integration. This involves integrating with our 
social and transaction APIs for 2 weeks to ensure that the most suitable data is being shared. It also allows 
Trustev to build up an accurate profile of the type of transactions being run through your site. A Trustev 
score is returned, but we would not expect you to alter a customer's experience or checkout based on this.

<b>Phase 3</b>

Phase 3 is essentially where the whole Trustev system is turned on, and you can allow or block customers based 
on the Trustev score. At this point, Trustev has an accurate profile of your customers, and has confidence 
that the integration has worked as expected.

## 2.0 Integrate Trustev.js
===========================

Phase 1 of integrating Trustev into you site just requires you to add a reference to Trusteev.js  Trustev.js can be integrated into any website within minutes. Trustev.js is a dynamic Javascript library that is repsonsible for determining the trust of any active session on any site, and can either be setup to control the session flow, or hand control back to the site once a trust profile is required.

### 2.1 Trustev.js

To integrate Trustev.js into your website, you need to insert a reference to Trustev.js in your site. To do this, you will need to get your Public Key from http://trustev.com/Reliance.

Once you have your public key, you can integrate Trustev.js into your site with just one line of code. This line of code must be placed between the opening head tag, and the closing head tag.


     <head>
        <script type=”text/javascript” src=”https://js.trustev.com/v1.1/Trustev.js?key=publickey”></script>
     </head>
	 
You should integrate Trustev.js in every page in your site. Trustev.js collects data about how the customer is using your site, including device information and their interaction with objects on the site. If Trustev.js is not included on every page, we not be able to monitor the customer's behaviour correctly, leading to an incomplete view of the customer and their activity. This can result in an inaccurate Trustev Score.

Next, you'll need to integrate the API for Phase 2.
