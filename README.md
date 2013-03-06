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
 tr><th width=308 align=left>    Code   </th><th width=308 align=left>  Explanation    </th></tr>
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
==================

To integrate Trustev.js into your website, you need to insert a reference to Trustev.js in your site. To do this, you will need to get your Public Key from trustev.com.
Once you have your public key, you can integrate Trustev.js into your site with just one line of code. This line of code must be placed between the closing body tag, and the closing html tag.


     </body>
         <script type=”text/javascript” src=”https://js.trustev.com/v1/Trustev.js?key=publickey” />
     </html>

