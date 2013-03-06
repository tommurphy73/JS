# Document Properties
========================

## Revision Log

<table> 
 <tr><th width=308 align=left>   Alteration         </th><th width=308 align=left>   Date        </th><th width=308 align=left>   Version Number  </th><th width=308 align=left> Changed By    </th></tr>
 <tr><td>                        Document Created              </td><td>             2012-11-22  </td><td>                        1.0             </td><td>                      Chris Kennedy </td></tr>
 <tr><td>                        Added Section 5.1.1           </td><td>             2012-11-23  </td><td>                        1.0.1           </td><td>                      Chris Kennedy </td></tr>
 <tr><td>                        Added Appendix A              </td><td>             2012-11-23  </td><td>                        1.0.2           </td><td>                      Chris Kennedy </td></tr>
 <tr><td>                        Added te_Timestamp to hashing </td><td>             2012-12-04  </td><td>                        1.0.3           </td><td>                      Chris Kennedy </td></tr>
</table>


##1.0 API Introduction
======================
 
### 1.1 Response Codes


<table> 
 <tr><th width=308 align=left>    Code   </th><th width=308 align=left>  Explanation    </th></tr>
 <tr><td>                        100    </td><td>                  Continue            </td></tr>
 <tr><td>                        200    </td><td>                  OK                  </td></tr>
 <tr><td>                        400    </td><td>                  Bad Request         </td></tr>
 <tr><td>                        401    </td><td>                  Not Authorised      </td></tr>
 <tr><td>                        403    </td><td>                  Forbidden           </td></tr>
 <tr><td>                        405    </td><td>                  Method Not Allowed  </td></tr>
 <tr><td>                        406    </td><td>                  Not Acceptable      </td></tr>
 <tr><td>                        408    </td><td>                  Timeout             </td></tr>
</table>


## 2.0 Integrate Trustev.js
===========================

Trustev.js can be integrated into any website within minutes. Trustev.js is a dynamic Javascript library that is repsonsible for determining the trust of any active session on any site, and can either be setup to control the session flow, or hand control back to the site once a trust profile is required.

### 2.1 Trustev.js

To integrate Trustev.js into your website, you need to insert a reference to Trustev.js in your site. To do this, you will need to get your Public Key from trustev.com.

Once you have your public key, you can integrate Trustev.js into your site with just one line of code. This line of code must be placed between the closing body tag, and the closing html tag.


     </body>
         <script type=”text/javascript” src=”https://js.trustev.com/v1/Trustev.js?key=publickey” />
     </html>

### 2.2 Trustev Social Authentication

Trustev.js Social Authentication is an optional feature for our partners, which enhances security and aims to improve the customer experience and conversions.

Trustev Social Authentication is designed to fit seamlessly into your existing checkout process. To setup Trustev Social Authentication, simply login to your Trustev account and answer a few questions about your checkout process. Once you have completed this step, simply add a new div (the id must be “TrustevProfileBox”) to the page where your customers normally enter their personal details/delivery address/billing address, and Trustev.js will import the necessary styles and create the content of the div. 

You can add this div anywhere within the body tags of your page.

     <body>
     . . . . . . . . . . . 
     <div id=”TrustevProfileBox”></div>
     . . . . . . . . . . .
     </body>
     
## 3.0 Functionality
====================

Trustev.js brings with it a whole host of functions to help secure your site, but also to help make your eCommerce process more friction less for your customers.

Trustev.js brings with it a whole host of functions to help secure your site, but also to help make your eCommerce process more friction less for your customers.

### 3.1 Trustev Social Authentication

Trustev.js helps to bring Social Authentication to your web site. Social Authenticaiton enables customers to sign in with one of their social network accounts, such as Facebook, Twitter or LinkedIn. Using Trustev Social Authentication is the quickest way to integrate Social Authentication into your site.

However, if you already have Social Authentication built into your site, you can always turn this feature off by logging in to your account on trustev.com and going to ‘My Sites’ -> ‘Site Settings’.

### 3.2 Trustev Auto Fill

Integrating Trustev.js into your site brings a whole host of functions to improve the customer experience. One of these is Trustev Auto Fill. Trustev Auto Fill populates your eCommerce process with the customer’s personal details, such as name, contact details and delivery/billing address.

Trustev Auto Fill can be used in conjunction with Trustev Social Authenticaiton. With Trustev Social Authenticaiton enabled, any customer that signs in using a social network will automatically have their details pre-populated into their checkout form. This signiifcantally reduces the amount of time required by the customer to complete the order, and has been proven to increase conversion rates.

If you have chosen to disable Trustev Social Authentication, you can still use Trustev Auto Fill. Trustev Auto Fill will work in combination with Social Network details that you share with us via the Trustev API, and will return the customer’s details to you, where you can choose how to handle this data. For more information on this, please see Section 5.1 of this document.

If you wish to disable Trustev Auto Fill, you can do this by logging in to your account on trustev.com and going to ‘My Sites’ -> ‘Site Settings’.

### 3.3 Trustev Remember Me

Trustev.js utilises numerous technologies to remember your customer’s personal details on a particular device. If the customer’s device comes back to your site, Trustev.js will load the customers personal details and pre-populate your checkout form with these details.

If you wish to disable Trustev Remember me, you can do this by logging in to your account on trustev.com and going to ‘My Sites’ -> ‘Site Settings’.

## 4.0 Basic Integration
========================

The basic integration option for Trustev.js enables Trustev to authenticate a customer using a social network, and to automatically protect you from un-trusted customers.

Basic integraiton is the simplest way to get Trustev protecting your site from un-trusted customers. All you need to do is follow the steps in sections 2.1 and 2.2.

Once you have done that, add the following code to the same page where you are displaying the Trustev Authentication block. This code is responsible for sharing specifics of the customer and the order with Trustev, which will then be analysed to create a Trust Profile.

### 4.1 Trustev Profile

This code must be added <b>after</b> your reference to Trustev.js.

    <script type=”text/javascript”>
      //create the Trustev Queue
      var _trustevQ = TrustevQ || [];
      //add a new transaction to the Trustev Queue
      _trustevQ.push([‘_addTrans’,
        ‘<Transaction Number>’,
        <Total Before Tax>,
        <Total Discount>,
        <Total Delivery>,
        <Total Tax>,
        <Currency>,
      ]);
      //add a new item to the just created transaction
      //this must be called for every item in the cart
      _trustevQ.push([‘_addItem’,
        ‘<Product Name>’,
        ‘<Product Sku>’,
        ‘<Product Category>’,
        ‘<Url>’,
        ‘<Image Url>’,
        <Quantity>,
        <Total Before Tax>,
        <Discount>,
        <Total Tax>
      ]);
      //once all items have been added to the transaction
      //you can commit the transaction to Trustev
      _trustevQ.push([‘_trackTrans’]);
    </script>



Once you have implemented this code, and commited the transaction to Trustev, Trustev.js will communicate with the Trustev servers. The Trustev servers will analyse all available data pertaining to the customer, including social network data, current transaction details such as order value, types of products and physical information about the customer. Once all data has been analysed, Trustev servers will return a Trust Profile to Trustev.js, which will then either allow, flag or block the transaction automatically.

## 5.0 Custom Integration
=========================

When a basic integration of the Trustev.js module does not work for you, Trustev can facilitate a custom integration. There are 2 customer integration options available, the one you choose depends on how you answer the following question:

<i>Do you have an existing social layer (i.e. sign in with Facebook/Twitter/LinkedIn) on your site?</i>

If <b>Yes</b>
 * Use Custom Integration Solution #1
 
If <b>No</b>
 * Use Custom Integration Solution #2


### 5.1 Solution #1

With this custom integration of Trustev.js, you can continue to utilise any social layer you already have in place. The steps involved are relatively simple, and only require a small amount of integration and testing work.

Step 1: Integrate Trustev.js as in Section 2.1 of this document

Step 2: Download the Trustev ‘Social and Transaction API Documentation’ from trustev.com

Step 3: Follow the instructions in this document to integrate with the Trustev API




