/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 developers-payu-latam
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.payu.sdk.constants;

/**
 * Holds REST API Constants and Resources
 *
 * @author PayU Latam
 * @since 1.0.0
 * @version 1.0.0, 21/08/2013
 */
public interface Resources {

	/**
	 * The API request methods
	 */
	enum RequestMethod {
		/** The get request method. */
		GET,
		/** The post request method. */
		POST,
		/** The delete request method. */
		DELETE,
		/** The put request method. */
		PUT
	}

	// ---------------------------------------------
	// URL (Named) Parameters identifiers
	// ---------------------------------------------

	/**
	 * API Version 4.3
	 */
	String V4_3 = "v4.3";

	/**
	 * API Version 4.0
	 */
	String V4_0 = "4.0";
	
	/**
	 * API Version 4.9
	 */
	String V4_9 = "v4.9";

	/**
	 * Payment Plan Current Version
	 */
	String PAYMENT_PLAN_VERSION = V4_9;

	/**
	 * Default API Current Version
	 */
	String CURRENT_API_VERSION = V4_0;

	// ---------------------------------------------
	// URL (Named) Parameters identifiers
	// ---------------------------------------------

	/**
	 * Default API URI
	 */
	String DEFAULT_API_URL = CURRENT_API_VERSION + "/service.cgi";

	/**
	 * Default entity API URI pattern
	 */
	String ENTITY_API_URL_PATTERN = "%srest/%s/%s";

	/**
	 * Default parameterized entity API URI pattern
	 */
	String PARAM_ENTITY_API_URL_PATTERN = "%srest/%s/%s/%s";

	/**
	 * Dependent entity API URI pattern
	 */
	String DEPENDENT_ENTITY_API_URL_PATTERN = "%srest/%s/%s/%s/%s";

	/**
	 * Dependent parameterized entity API URI pattern
	 */
	String DEPENDENT_PARAM_ENTITY_API_URL_PATTERN = "%srest/%s/%s/%s/%s/%s";

	/**
	 * Plans Operations URI
	 */
	String URI_PLANS = "plans";

	/**
	 * Subscription URI
	 */
	String URI_SUBSCRIPTIONS = "subscriptions";

	/**
	 * Recurring bill items URI
	 */
	String URI_RECURRING_BILL_ITEMS = "recurringBillItems";

	/**
	 * Recurring bill item URI
	 */
	String URI_RECURRING_BILL = "recurringBill";

	/**
	 * Customers item URI
	 */
	String URI_CUSTOMERS = "customers";

	/**
	 * Credit Card's item URI
	 */
	String URI_CREDIT_CARDS = "creditCards";

	/**
	 * Bank accounts item URI
	 */
	String URI_BANK_ACCOUNTS = "bankAccounts";
	
	/**
	 * Recurring bill payment retry
	 */
	String URI_RECURRING_BILLL_PAYMENT_RETRY = "paymentRetry";

}
