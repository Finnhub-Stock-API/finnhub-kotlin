# DefaultApi

All URIs are relative to *https://finnhub.io/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aggregateIndicator**](DefaultApi.md#aggregateIndicator) | **GET** /scan/technical-indicator | Aggregate Indicators
[**companyBasicFinancials**](DefaultApi.md#companyBasicFinancials) | **GET** /stock/metric | Basic Financials
[**companyEarnings**](DefaultApi.md#companyEarnings) | **GET** /stock/earnings | Earnings Surprises
[**companyEpsEstimates**](DefaultApi.md#companyEpsEstimates) | **GET** /stock/eps-estimate | Earnings Estimates
[**companyExecutive**](DefaultApi.md#companyExecutive) | **GET** /stock/executive | Company Executive
[**companyNews**](DefaultApi.md#companyNews) | **GET** /company-news | Company News
[**companyPeers**](DefaultApi.md#companyPeers) | **GET** /stock/peers | Peers
[**companyProfile**](DefaultApi.md#companyProfile) | **GET** /stock/profile | Company Profile
[**companyProfile2**](DefaultApi.md#companyProfile2) | **GET** /stock/profile2 | Company Profile 2
[**companyRevenueEstimates**](DefaultApi.md#companyRevenueEstimates) | **GET** /stock/revenue-estimate | Revenue Estimates
[**country**](DefaultApi.md#country) | **GET** /country | Country Metadata
[**covid19**](DefaultApi.md#covid19) | **GET** /covid19/us | COVID-19
[**cryptoCandles**](DefaultApi.md#cryptoCandles) | **GET** /crypto/candle | Crypto Candles
[**cryptoExchanges**](DefaultApi.md#cryptoExchanges) | **GET** /crypto/exchange | Crypto Exchanges
[**cryptoSymbols**](DefaultApi.md#cryptoSymbols) | **GET** /crypto/symbol | Crypto Symbol
[**earningsCalendar**](DefaultApi.md#earningsCalendar) | **GET** /calendar/earnings | Earnings Calendar
[**economicCode**](DefaultApi.md#economicCode) | **GET** /economic/code | Economic Code
[**economicData**](DefaultApi.md#economicData) | **GET** /economic | Economic Data
[**etfsCountryExposure**](DefaultApi.md#etfsCountryExposure) | **GET** /etf/country | ETFs Country Exposure
[**etfsHoldings**](DefaultApi.md#etfsHoldings) | **GET** /etf/holdings | ETFs Holdings
[**etfsIndustryExposure**](DefaultApi.md#etfsIndustryExposure) | **GET** /etf/sector | ETFs Industry Exposure
[**etfsProfile**](DefaultApi.md#etfsProfile) | **GET** /etf/profile | ETFs Profile
[**filings**](DefaultApi.md#filings) | **GET** /stock/filings | Filings
[**financials**](DefaultApi.md#financials) | **GET** /stock/financials | Financial Statements
[**financialsReported**](DefaultApi.md#financialsReported) | **GET** /stock/financials-reported | Financials As Reported
[**forexCandles**](DefaultApi.md#forexCandles) | **GET** /forex/candle | Forex Candles
[**forexExchanges**](DefaultApi.md#forexExchanges) | **GET** /forex/exchange | Forex Exchanges
[**forexRates**](DefaultApi.md#forexRates) | **GET** /forex/rates | Forex rates
[**forexSymbols**](DefaultApi.md#forexSymbols) | **GET** /forex/symbol | Forex Symbol
[**fundOwnership**](DefaultApi.md#fundOwnership) | **GET** /stock/fund-ownership | Fund Ownership
[**generalNews**](DefaultApi.md#generalNews) | **GET** /news | General News
[**indicesConstituents**](DefaultApi.md#indicesConstituents) | **GET** /index/constituents | Indices Constituents
[**indicesHistoricalConstituents**](DefaultApi.md#indicesHistoricalConstituents) | **GET** /index/historical-constituents | Indices Historical Constituents
[**investorsOwnership**](DefaultApi.md#investorsOwnership) | **GET** /stock/investor-ownership | Investors Ownership
[**ipoCalendar**](DefaultApi.md#ipoCalendar) | **GET** /calendar/ipo | IPO Calendar
[**majorDevelopments**](DefaultApi.md#majorDevelopments) | **GET** /major-development | Major Developments
[**newsSentiment**](DefaultApi.md#newsSentiment) | **GET** /news-sentiment | News Sentiment
[**patternRecognition**](DefaultApi.md#patternRecognition) | **GET** /scan/pattern | Pattern Recognition
[**priceTarget**](DefaultApi.md#priceTarget) | **GET** /stock/price-target | Price Target
[**quote**](DefaultApi.md#quote) | **GET** /quote | Quote
[**recommendationTrends**](DefaultApi.md#recommendationTrends) | **GET** /stock/recommendation | Recommendation Trends
[**similarityIndex**](DefaultApi.md#similarityIndex) | **GET** /stock/similarity-index | Similarity Index
[**stockBidask**](DefaultApi.md#stockBidask) | **GET** /stock/bidask | Last Bid-Ask
[**stockCandles**](DefaultApi.md#stockCandles) | **GET** /stock/candle | Stock Candles
[**stockDividends**](DefaultApi.md#stockDividends) | **GET** /stock/dividend | Dividends
[**stockSplits**](DefaultApi.md#stockSplits) | **GET** /stock/split | Splits
[**stockSymbols**](DefaultApi.md#stockSymbols) | **GET** /stock/symbol | Stock Symbol
[**stockTick**](DefaultApi.md#stockTick) | **GET** /stock/tick | Tick Data
[**supportResistance**](DefaultApi.md#supportResistance) | **GET** /scan/support-resistance | Support/Resistance
[**technicalIndicator**](DefaultApi.md#technicalIndicator) | **POST** /indicator | Technical Indicators
[**transcripts**](DefaultApi.md#transcripts) | **GET** /stock/transcripts | Earnings Call Transcripts
[**transcriptsList**](DefaultApi.md#transcriptsList) | **GET** /stock/transcripts/list | Earnings Call Transcripts List
[**upgradeDowngrade**](DefaultApi.md#upgradeDowngrade) | **GET** /stock/upgrade-downgrade | Stock Upgrade/Downgrade


<a name="aggregateIndicator"></a>
# **aggregateIndicator**
> AggregateIndicators aggregateIndicator(symbol, resolution)

Aggregate Indicators

Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | symbol
val resolution : kotlin.String = resolution_example // kotlin.String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
try {
    val result : AggregateIndicators = apiInstance.aggregateIndicator(symbol, resolution)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#aggregateIndicator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#aggregateIndicator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| symbol |
 **resolution** | **kotlin.String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |

### Return type

[**AggregateIndicators**](AggregateIndicators.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyBasicFinancials"></a>
# **companyBasicFinancials**
> BasicFinancials companyBasicFinancials(symbol, metric)

Basic Financials

Get company basic financials such as margin, P/E ratio, 52-week high/low etc.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
val metric : kotlin.String = metric_example // kotlin.String | Metric type. Can be 1 of the following values <code>all, price, valuation, margin</code>
try {
    val result : BasicFinancials = apiInstance.companyBasicFinancials(symbol, metric)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyBasicFinancials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyBasicFinancials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |
 **metric** | **kotlin.String**| Metric type. Can be 1 of the following values &lt;code&gt;all, price, valuation, margin&lt;/code&gt; |

### Return type

[**BasicFinancials**](BasicFinancials.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyEarnings"></a>
# **companyEarnings**
> kotlin.collections.List&lt;EarningResult&gt; companyEarnings(symbol, limit)

Earnings Surprises

Get company historical quarterly earnings surprise going back to 2000.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
val limit : kotlin.Long = 789 // kotlin.Long | Limit number of period returned. Leave blank to get the full history.
try {
    val result : kotlin.collections.List<EarningResult> = apiInstance.companyEarnings(symbol, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyEarnings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyEarnings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |
 **limit** | **kotlin.Long**| Limit number of period returned. Leave blank to get the full history. | [optional]

### Return type

[**kotlin.collections.List&lt;EarningResult&gt;**](EarningResult.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyEpsEstimates"></a>
# **companyEpsEstimates**
> EarningsEstimates companyEpsEstimates(symbol, freq)

Earnings Estimates

Get company&#39;s EPS estimates.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
val freq : kotlin.String = freq_example // kotlin.String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
try {
    val result : EarningsEstimates = apiInstance.companyEpsEstimates(symbol, freq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyEpsEstimates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyEpsEstimates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |
 **freq** | **kotlin.String**| Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional]

### Return type

[**EarningsEstimates**](EarningsEstimates.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyExecutive"></a>
# **companyExecutive**
> CompanyExecutive companyExecutive(symbol)

Company Executive

Get a list of company&#39;s executives and members of the Board.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
try {
    val result : CompanyExecutive = apiInstance.companyExecutive(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyExecutive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyExecutive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |

### Return type

[**CompanyExecutive**](CompanyExecutive.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyNews"></a>
# **companyNews**
> kotlin.collections.List&lt;News&gt; companyNews(symbol, from, to)

Company News

List latest company news by symbol. This endpoint is only available for North American companies.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Company symbol.
val from : kotlin.String = 2013-10-20 // kotlin.String | From date <code>YYYY-MM-DD</code>.
val to : kotlin.String = 2013-10-20 // kotlin.String | To date <code>YYYY-MM-DD</code>.
try {
    val result : kotlin.collections.List<News> = apiInstance.companyNews(symbol, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyNews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Company symbol. |
 **from** | **kotlin.String**| From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to** | **kotlin.String**| To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |

### Return type

[**kotlin.collections.List&lt;News&gt;**](News.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyPeers"></a>
# **companyPeers**
> kotlin.collections.List&lt;kotlin.String&gt; companyPeers(symbol)

Peers

Get company peers. Return a list of peers in the same country and GICS sub-industry

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.companyPeers(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyPeers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyPeers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyProfile"></a>
# **companyProfile**
> CompanyProfile companyProfile(symbol, isin, cusip)

Company Profile

Get general information of a company. You can query by symbol, ISIN or CUSIP

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL e.g.
val isin : kotlin.String = isin_example // kotlin.String | ISIN
val cusip : kotlin.String = cusip_example // kotlin.String | CUSIP
try {
    val result : CompanyProfile = apiInstance.companyProfile(symbol, isin, cusip)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL e.g. | [optional]
 **isin** | **kotlin.String**| ISIN | [optional]
 **cusip** | **kotlin.String**| CUSIP | [optional]

### Return type

[**CompanyProfile**](CompanyProfile.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyProfile2"></a>
# **companyProfile2**
> CompanyProfile2 companyProfile2(symbol, isin, cusip)

Company Profile 2

Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL e.g.
val isin : kotlin.String = isin_example // kotlin.String | ISIN
val cusip : kotlin.String = cusip_example // kotlin.String | CUSIP
try {
    val result : CompanyProfile2 = apiInstance.companyProfile2(symbol, isin, cusip)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyProfile2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyProfile2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL e.g. | [optional]
 **isin** | **kotlin.String**| ISIN | [optional]
 **cusip** | **kotlin.String**| CUSIP | [optional]

### Return type

[**CompanyProfile2**](CompanyProfile2.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="companyRevenueEstimates"></a>
# **companyRevenueEstimates**
> RevenueEstimates companyRevenueEstimates(symbol, freq)

Revenue Estimates

Get company&#39;s revenue estimates.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
val freq : kotlin.String = freq_example // kotlin.String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
try {
    val result : RevenueEstimates = apiInstance.companyRevenueEstimates(symbol, freq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#companyRevenueEstimates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#companyRevenueEstimates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |
 **freq** | **kotlin.String**| Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional]

### Return type

[**RevenueEstimates**](RevenueEstimates.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="country"></a>
# **country**
> kotlin.collections.List&lt;CountryMetadata&gt; country()

Country Metadata

List all countries and metadata.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<CountryMetadata> = apiInstance.country()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#country")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#country")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;CountryMetadata&gt;**](CountryMetadata.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="covid19"></a>
# **covid19**
> kotlin.collections.List&lt;CovidInfo&gt; covid19()

COVID-19

Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<CovidInfo> = apiInstance.covid19()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#covid19")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#covid19")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;CovidInfo&gt;**](CovidInfo.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoCandles"></a>
# **cryptoCandles**
> CryptoCandles cryptoCandles(symbol, resolution, from, to)

Crypto Candles

Get candlestick data for crypto symbols.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Use symbol returned in <code>/crypto/symbol</code> endpoint for this field.
val resolution : kotlin.String = resolution_example // kotlin.String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
val from : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval initial value.
val to : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval end value.
try {
    val result : CryptoCandles = apiInstance.cryptoCandles(symbol, resolution, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#cryptoCandles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#cryptoCandles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. |
 **resolution** | **kotlin.String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |
 **from** | **kotlin.Long**| UNIX timestamp. Interval initial value. |
 **to** | **kotlin.Long**| UNIX timestamp. Interval end value. |

### Return type

[**CryptoCandles**](CryptoCandles.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoExchanges"></a>
# **cryptoExchanges**
> kotlin.collections.List&lt;kotlin.String&gt; cryptoExchanges()

Crypto Exchanges

List supported crypto exchanges

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.cryptoExchanges()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#cryptoExchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#cryptoExchanges")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cryptoSymbols"></a>
# **cryptoSymbols**
> kotlin.collections.List&lt;CryptoSymbol&gt; cryptoSymbols(exchange)

Crypto Symbol

List supported crypto symbols by exchange

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val exchange : kotlin.String = exchange_example // kotlin.String | Exchange you want to get the list of symbols from.
try {
    val result : kotlin.collections.List<CryptoSymbol> = apiInstance.cryptoSymbols(exchange)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#cryptoSymbols")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#cryptoSymbols")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | **kotlin.String**| Exchange you want to get the list of symbols from. |

### Return type

[**kotlin.collections.List&lt;CryptoSymbol&gt;**](CryptoSymbol.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="earningsCalendar"></a>
# **earningsCalendar**
> EarningsCalendar earningsCalendar(from, to, symbol, international)

Earnings Calendar

Get historical and coming earnings release dating back to 2003. You can setup &lt;a href&#x3D;\&quot;#webhook\&quot;&gt;webhook&lt;/a&gt; to receive real-time earnings update.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = 2013-10-20 // kotlin.String | From date: 2020-03-15.
val to : kotlin.String = 2013-10-20 // kotlin.String | To date: 2020-03-16.
val symbol : kotlin.String = symbol_example // kotlin.String | Filter by symbol: AAPL.
val international : kotlin.Boolean = true // kotlin.Boolean | Set to <code>true</code> to include international markets. Default value is <code>false</code>
try {
    val result : EarningsCalendar = apiInstance.earningsCalendar(from, to, symbol, international)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#earningsCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#earningsCalendar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| From date: 2020-03-15. | [optional]
 **to** | **kotlin.String**| To date: 2020-03-16. | [optional]
 **symbol** | **kotlin.String**| Filter by symbol: AAPL. | [optional]
 **international** | **kotlin.Boolean**| Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; | [optional]

### Return type

[**EarningsCalendar**](EarningsCalendar.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="economicCode"></a>
# **economicCode**
> kotlin.collections.List&lt;EconomicCode&gt; economicCode()

Economic Code

List codes of supported economic data.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<EconomicCode> = apiInstance.economicCode()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#economicCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#economicCode")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;EconomicCode&gt;**](EconomicCode.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="economicData"></a>
# **economicData**
> EconomicData economicData(code)

Economic Data

Get economic data.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val code : kotlin.String = code_example // kotlin.String | Economic code.
try {
    val result : EconomicData = apiInstance.economicData(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#economicData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#economicData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| Economic code. |

### Return type

[**EconomicData**](EconomicData.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="etfsCountryExposure"></a>
# **etfsCountryExposure**
> ETFsCountryExposure etfsCountryExposure(symbol)

ETFs Country Exposure

Get ETF country exposure data.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | ETF symbol.
try {
    val result : ETFsCountryExposure = apiInstance.etfsCountryExposure(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#etfsCountryExposure")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#etfsCountryExposure")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| ETF symbol. |

### Return type

[**ETFsCountryExposure**](ETFsCountryExposure.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="etfsHoldings"></a>
# **etfsHoldings**
> ETFsHoldings etfsHoldings(symbol)

ETFs Holdings

Get current ETF holdings.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | ETF symbol.
try {
    val result : ETFsHoldings = apiInstance.etfsHoldings(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#etfsHoldings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#etfsHoldings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| ETF symbol. |

### Return type

[**ETFsHoldings**](ETFsHoldings.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="etfsIndustryExposure"></a>
# **etfsIndustryExposure**
> ETFsIndustryExposure etfsIndustryExposure(symbol)

ETFs Industry Exposure

Get ETF industry exposure data.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | ETF symbol.
try {
    val result : ETFsIndustryExposure = apiInstance.etfsIndustryExposure(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#etfsIndustryExposure")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#etfsIndustryExposure")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| ETF symbol. |

### Return type

[**ETFsIndustryExposure**](ETFsIndustryExposure.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="etfsProfile"></a>
# **etfsProfile**
> ETFsProfile etfsProfile(symbol)

ETFs Profile

Get ETF profile information. Currently support all US ETFs.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | ETF symbol.
try {
    val result : ETFsProfile = apiInstance.etfsProfile(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#etfsProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#etfsProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| ETF symbol. |

### Return type

[**ETFsProfile**](ETFsProfile.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="filings"></a>
# **filings**
> kotlin.collections.List&lt;Filing&gt; filings(symbol, cik, accessNumber, form, from, to)

Filings

List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol. Leave <code>symbol</code>,<code>cik</code> and <code>accessNumber</code> empty to list latest filings.
val cik : kotlin.String = cik_example // kotlin.String | CIK.
val accessNumber : kotlin.String = accessNumber_example // kotlin.String | Access number of a specific report you want to retrieve data from.
val form : kotlin.String = form_example // kotlin.String | Filter by form. You can use this value <code>NT 10-K</code> to find non-timely filings for a company.
val from : kotlin.String = 2013-10-20 // kotlin.String | From date: 2020-03-15.
val to : kotlin.String = 2013-10-20 // kotlin.String | To date: 2020-03-16.
try {
    val result : kotlin.collections.List<Filing> = apiInstance.filings(symbol, cik, accessNumber, form, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#filings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#filings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. | [optional]
 **cik** | **kotlin.String**| CIK. | [optional]
 **accessNumber** | **kotlin.String**| Access number of a specific report you want to retrieve data from. | [optional]
 **form** | **kotlin.String**| Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. | [optional]
 **from** | **kotlin.String**| From date: 2020-03-15. | [optional]
 **to** | **kotlin.String**| To date: 2020-03-16. | [optional]

### Return type

[**kotlin.collections.List&lt;Filing&gt;**](Filing.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="financials"></a>
# **financials**
> FinancialStatements financials(symbol, statement, freq)

Financial Statements

Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
val statement : kotlin.String = statement_example // kotlin.String | Statement can take 1 of these values <code>bs, ic, cf</code> for Balance Sheet, Income Statement, Cash Flow respectively.
val freq : kotlin.String = freq_example // kotlin.String | Frequency can take 1 of these values <code>annual, quarterly, ttm, ytd</code>.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow.
try {
    val result : FinancialStatements = apiInstance.financials(symbol, statement, freq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#financials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#financials")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |
 **statement** | **kotlin.String**| Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. |
 **freq** | **kotlin.String**| Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. |

### Return type

[**FinancialStatements**](FinancialStatements.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="financialsReported"></a>
# **financialsReported**
> FinancialsAsReported financialsReported(symbol, cik, accessNumber, freq)

Financials As Reported

Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol.
val cik : kotlin.String = cik_example // kotlin.String | CIK.
val accessNumber : kotlin.String = accessNumber_example // kotlin.String | Access number of a specific report you want to retrieve financials from.
val freq : kotlin.String = freq_example // kotlin.String | Frequency. Can be either <code>annual</code> or <code>quarterly</code>. Default to <code>annual</code>.
try {
    val result : FinancialsAsReported = apiInstance.financialsReported(symbol, cik, accessNumber, freq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#financialsReported")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#financialsReported")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. | [optional]
 **cik** | **kotlin.String**| CIK. | [optional]
 **accessNumber** | **kotlin.String**| Access number of a specific report you want to retrieve financials from. | [optional]
 **freq** | **kotlin.String**| Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. | [optional]

### Return type

[**FinancialsAsReported**](FinancialsAsReported.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forexCandles"></a>
# **forexCandles**
> ForexCandles forexCandles(symbol, resolution, from, to)

Forex Candles

Get candlestick data for forex symbols.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Use symbol returned in <code>/forex/symbol</code> endpoint for this field.
val resolution : kotlin.String = resolution_example // kotlin.String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
val from : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval initial value.
val to : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval end value.
try {
    val result : ForexCandles = apiInstance.forexCandles(symbol, resolution, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#forexCandles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#forexCandles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. |
 **resolution** | **kotlin.String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |
 **from** | **kotlin.Long**| UNIX timestamp. Interval initial value. |
 **to** | **kotlin.Long**| UNIX timestamp. Interval end value. |

### Return type

[**ForexCandles**](ForexCandles.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forexExchanges"></a>
# **forexExchanges**
> kotlin.collections.List&lt;kotlin.String&gt; forexExchanges()

Forex Exchanges

List supported forex exchanges

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.forexExchanges()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#forexExchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#forexExchanges")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forexRates"></a>
# **forexRates**
> Forexrates forexRates(base)

Forex rates

Get rates for all forex pairs. Ideal for currency conversion

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val base : kotlin.String = base_example // kotlin.String | Base currency. Default to EUR.
try {
    val result : Forexrates = apiInstance.forexRates(base)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#forexRates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#forexRates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **base** | **kotlin.String**| Base currency. Default to EUR. | [optional]

### Return type

[**Forexrates**](Forexrates.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="forexSymbols"></a>
# **forexSymbols**
> kotlin.collections.List&lt;ForexSymbol&gt; forexSymbols(exchange)

Forex Symbol

List supported forex symbols.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val exchange : kotlin.String = exchange_example // kotlin.String | Exchange you want to get the list of symbols from.
try {
    val result : kotlin.collections.List<ForexSymbol> = apiInstance.forexSymbols(exchange)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#forexSymbols")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#forexSymbols")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | **kotlin.String**| Exchange you want to get the list of symbols from. |

### Return type

[**kotlin.collections.List&lt;ForexSymbol&gt;**](ForexSymbol.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fundOwnership"></a>
# **fundOwnership**
> FundOwnership fundOwnership(symbol, limit)

Fund Ownership

Get a full list fund and institutional investors of a company in descending order of the number of shares held.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
val limit : kotlin.Long = 789 // kotlin.Long | Limit number of results. Leave empty to get the full list.
try {
    val result : FundOwnership = apiInstance.fundOwnership(symbol, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#fundOwnership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#fundOwnership")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |
 **limit** | **kotlin.Long**| Limit number of results. Leave empty to get the full list. | [optional]

### Return type

[**FundOwnership**](FundOwnership.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="generalNews"></a>
# **generalNews**
> kotlin.collections.List&lt;News&gt; generalNews(category, minId)

General News

Get latest market news.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val category : kotlin.String = category_example // kotlin.String | This parameter can be 1 of the following values <code>general, forex, crypto, merger</code>.
val minId : kotlin.String = minId_example // kotlin.String | Use this field to get only news after this ID. Default to 0
try {
    val result : kotlin.collections.List<News> = apiInstance.generalNews(category, minId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#generalNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#generalNews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **kotlin.String**| This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. |
 **minId** | **kotlin.String**| Use this field to get only news after this ID. Default to 0 | [optional]

### Return type

[**kotlin.collections.List&lt;News&gt;**](News.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="indicesConstituents"></a>
# **indicesConstituents**
> IndicesConstituents indicesConstituents(symbol)

Indices Constituents

Get a list of index&#39;s constituents. Currently support &lt;code&gt;^GSPC (S&amp;P 500)&lt;/code&gt;, &lt;code&gt;^NDX (Nasdaq 100)&lt;/code&gt;, &lt;code&gt;^DJI (Dow Jones)&lt;/code&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | symbol
try {
    val result : IndicesConstituents = apiInstance.indicesConstituents(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#indicesConstituents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#indicesConstituents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| symbol |

### Return type

[**IndicesConstituents**](IndicesConstituents.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="indicesHistoricalConstituents"></a>
# **indicesHistoricalConstituents**
> IndicesHistoricalConstituents indicesHistoricalConstituents(symbol)

Indices Historical Constituents

Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC (S&amp;P 500)&lt;/code&gt;, &lt;code&gt;^NDX (Nasdaq 100)&lt;/code&gt;, &lt;code&gt;^DJI (Dow Jones)&lt;/code&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | symbol
try {
    val result : IndicesHistoricalConstituents = apiInstance.indicesHistoricalConstituents(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#indicesHistoricalConstituents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#indicesHistoricalConstituents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| symbol |

### Return type

[**IndicesHistoricalConstituents**](IndicesHistoricalConstituents.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="investorsOwnership"></a>
# **investorsOwnership**
> InvestorsOwnership investorsOwnership(symbol, limit)

Investors Ownership

Get a full list of shareholders/investors of a company in descending order of the number of shares held.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
val limit : kotlin.Long = 789 // kotlin.Long | Limit number of results. Leave empty to get the full list.
try {
    val result : InvestorsOwnership = apiInstance.investorsOwnership(symbol, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#investorsOwnership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#investorsOwnership")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |
 **limit** | **kotlin.Long**| Limit number of results. Leave empty to get the full list. | [optional]

### Return type

[**InvestorsOwnership**](InvestorsOwnership.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipoCalendar"></a>
# **ipoCalendar**
> IPOCalendar ipoCalendar(from, to)

IPO Calendar

Get recent and coming IPO.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = 2013-10-20 // kotlin.String | From date: 2020-03-15.
val to : kotlin.String = 2013-10-20 // kotlin.String | To date: 2020-03-16.
try {
    val result : IPOCalendar = apiInstance.ipoCalendar(from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#ipoCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#ipoCalendar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **kotlin.String**| From date: 2020-03-15. |
 **to** | **kotlin.String**| To date: 2020-03-16. |

### Return type

[**IPOCalendar**](IPOCalendar.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="majorDevelopments"></a>
# **majorDevelopments**
> MajorDevelopments majorDevelopments(symbol, from, to)

Major Developments

List latest major developments of a company going back 20 years with 12M+ data points. This data can be used to highlight the most significant events.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Company symbol.
val from : kotlin.String = 2013-10-20 // kotlin.String | From time: 2020-01-01.
val to : kotlin.String = 2013-10-20 // kotlin.String | To time: 2020-01-05.
try {
    val result : MajorDevelopments = apiInstance.majorDevelopments(symbol, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#majorDevelopments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#majorDevelopments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Company symbol. |
 **from** | **kotlin.String**| From time: 2020-01-01. | [optional]
 **to** | **kotlin.String**| To time: 2020-01-05. | [optional]

### Return type

[**MajorDevelopments**](MajorDevelopments.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newsSentiment"></a>
# **newsSentiment**
> NewsSentiment newsSentiment(symbol)

News Sentiment

Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Company symbol.
try {
    val result : NewsSentiment = apiInstance.newsSentiment(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#newsSentiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#newsSentiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Company symbol. |

### Return type

[**NewsSentiment**](NewsSentiment.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patternRecognition"></a>
# **patternRecognition**
> PatternRecognition patternRecognition(symbol, resolution)

Pattern Recognition

Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol
val resolution : kotlin.String = resolution_example // kotlin.String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
try {
    val result : PatternRecognition = apiInstance.patternRecognition(symbol, resolution)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#patternRecognition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#patternRecognition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol |
 **resolution** | **kotlin.String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |

### Return type

[**PatternRecognition**](PatternRecognition.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="priceTarget"></a>
# **priceTarget**
> PriceTarget priceTarget(symbol)

Price Target

Get latest price target consensus.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
try {
    val result : PriceTarget = apiInstance.priceTarget(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#priceTarget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#priceTarget")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |

### Return type

[**PriceTarget**](PriceTarget.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quote"></a>
# **quote**
> Quote quote(symbol)

Quote

&lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time update.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol
try {
    val result : Quote = apiInstance.quote(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#quote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#quote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol |

### Return type

[**Quote**](Quote.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recommendationTrends"></a>
# **recommendationTrends**
> kotlin.collections.List&lt;RecommendationTrend&gt; recommendationTrends(symbol)

Recommendation Trends

Get latest analyst recommendation trends for a company.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL.
try {
    val result : kotlin.collections.List<RecommendationTrend> = apiInstance.recommendationTrends(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recommendationTrends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recommendationTrends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. |

### Return type

[**kotlin.collections.List&lt;RecommendationTrend&gt;**](RecommendationTrend.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="similarityIndex"></a>
# **similarityIndex**
> SimilarityIndex similarityIndex(symbol, cik, freq)

Similarity Index

&lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol. Required if cik is empty
val cik : kotlin.String = cik_example // kotlin.String | CIK. Required if symbol is empty
val freq : kotlin.String = freq_example // kotlin.String | <code>annual</code> or <code>quarterly</code>. Default to <code>annual</code>
try {
    val result : SimilarityIndex = apiInstance.similarityIndex(symbol, cik, freq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#similarityIndex")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#similarityIndex")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. Required if cik is empty | [optional]
 **cik** | **kotlin.String**| CIK. Required if symbol is empty | [optional]
 **freq** | **kotlin.String**| &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; | [optional]

### Return type

[**SimilarityIndex**](SimilarityIndex.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stockBidask"></a>
# **stockBidask**
> LastBidMinusAsk stockBidask(symbol)

Last Bid-Ask

Get last bid/ask data for US stocks.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol.
try {
    val result : LastBidMinusAsk = apiInstance.stockBidask(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#stockBidask")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#stockBidask")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. |

### Return type

[**LastBidMinusAsk**](LastBidMinusAsk.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stockCandles"></a>
# **stockCandles**
> StockCandles stockCandles(symbol, resolution, from, to, adjusted)

Stock Candles

&lt;p&gt;Get candlestick data for stocks going back 25 years for US stocks.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol.
val resolution : kotlin.String = resolution_example // kotlin.String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
val from : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval initial value.
val to : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval end value.
val adjusted : kotlin.String = adjusted_example // kotlin.String | By default, <code>adjusted=false</code>. Use <code>true</code> to get adjusted data.
try {
    val result : StockCandles = apiInstance.stockCandles(symbol, resolution, from, to, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#stockCandles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#stockCandles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. |
 **resolution** | **kotlin.String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |
 **from** | **kotlin.Long**| UNIX timestamp. Interval initial value. |
 **to** | **kotlin.Long**| UNIX timestamp. Interval end value. |
 **adjusted** | **kotlin.String**| By default, &lt;code&gt;adjusted&#x3D;false&lt;/code&gt;. Use &lt;code&gt;true&lt;/code&gt; to get adjusted data. | [optional]

### Return type

[**StockCandles**](StockCandles.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stockDividends"></a>
# **stockDividends**
> kotlin.collections.List&lt;Dividends&gt; stockDividends(symbol, from, to)

Dividends

Get dividends data for common stocks going back 30 years.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol.
val from : kotlin.String = 2013-10-20 // kotlin.String | YYYY-MM-DD.
val to : kotlin.String = 2013-10-20 // kotlin.String | YYYY-MM-DD.
try {
    val result : kotlin.collections.List<Dividends> = apiInstance.stockDividends(symbol, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#stockDividends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#stockDividends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. |
 **from** | **kotlin.String**| YYYY-MM-DD. |
 **to** | **kotlin.String**| YYYY-MM-DD. |

### Return type

[**kotlin.collections.List&lt;Dividends&gt;**](Dividends.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stockSplits"></a>
# **stockSplits**
> kotlin.collections.List&lt;Split&gt; stockSplits(symbol, from, to)

Splits

Get splits data for stocks.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol.
val from : kotlin.String = 2013-10-20 // kotlin.String | YYYY-MM-DD.
val to : kotlin.String = 2013-10-20 // kotlin.String | YYYY-MM-DD.
try {
    val result : kotlin.collections.List<Split> = apiInstance.stockSplits(symbol, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#stockSplits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#stockSplits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. |
 **from** | **kotlin.String**| YYYY-MM-DD. |
 **to** | **kotlin.String**| YYYY-MM-DD. |

### Return type

[**kotlin.collections.List&lt;Split&gt;**](Split.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stockSymbols"></a>
# **stockSymbols**
> kotlin.collections.List&lt;Stock&gt; stockSymbols(exchange)

Stock Symbol

List supported stocks. A list of supported CFD Indices can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1BAbIXBgl405fj0oHeEyRFEu8mW4QD1PhvtaBATLoR14/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val exchange : kotlin.String = exchange_example // kotlin.String | Exchange you want to get the list of symbols from. List of exchanges with fundamental data can be found <a href=\"https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp=sharing\" target=\"_blank\">here</a>.
try {
    val result : kotlin.collections.List<Stock> = apiInstance.stockSymbols(exchange)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#stockSymbols")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#stockSymbols")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | **kotlin.String**| Exchange you want to get the list of symbols from. List of exchanges with fundamental data can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |

### Return type

[**kotlin.collections.List&lt;Stock&gt;**](Stock.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stockTick"></a>
# **stockTick**
> TickData stockTick(symbol, date, limit, skip)

Tick Data

&lt;p&gt;Get historical tick data for US stocks from all 13 exchanges. You can send the request directly to our tick server at &lt;a href&#x3D;\&quot;https://tick.finnhub.io/\&quot;&gt;https://tick.finnhub.io/&lt;/a&gt; with the same path and parameters or get redirected there if you call our main server. Data is updated at the end of each trading day.&lt;/p&gt;&lt;p&gt;Tick data from 1985 is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to learn more.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol.
val date : kotlin.String = 2013-10-20 // kotlin.String | Date: 2020-04-02.
val limit : kotlin.Long = 789 // kotlin.Long | Limit number of ticks returned. Maximum value: <code>25000</code>
val skip : kotlin.Long = 789 // kotlin.Long | Number of ticks to skip. Use this parameter to loop through the entire data.
try {
    val result : TickData = apiInstance.stockTick(symbol, date, limit, skip)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#stockTick")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#stockTick")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol. |
 **date** | **kotlin.String**| Date: 2020-04-02. |
 **limit** | **kotlin.Long**| Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; |
 **skip** | **kotlin.Long**| Number of ticks to skip. Use this parameter to loop through the entire data. |

### Return type

[**TickData**](TickData.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="supportResistance"></a>
# **supportResistance**
> SupportResistance supportResistance(symbol, resolution)

Support/Resistance

Get support and resistance levels for a symbol.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol
val resolution : kotlin.String = resolution_example // kotlin.String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
try {
    val result : SupportResistance = apiInstance.supportResistance(symbol, resolution)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#supportResistance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#supportResistance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol |
 **resolution** | **kotlin.String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |

### Return type

[**SupportResistance**](SupportResistance.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="technicalIndicator"></a>
# **technicalIndicator**
> kotlin.Any technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields)

Technical Indicators

Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | symbol
val resolution : kotlin.String = resolution_example // kotlin.String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
val from : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval initial value.
val to : kotlin.Long = 789 // kotlin.Long | UNIX timestamp. Interval end value.
val indicator : kotlin.String = indicator_example // kotlin.String | Indicator name. Full list can be found <a href=\"https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing\" target=\"_blank\">here</a>.
val indicatorFields : kotlin.Any = Object // kotlin.Any | Check out <a href=\"https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing\" target=\"_blank\">this page</a> to see which indicators and params are supported.
try {
    val result : kotlin.Any = apiInstance.technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#technicalIndicator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#technicalIndicator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| symbol |
 **resolution** | **kotlin.String**| Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |
 **from** | **kotlin.Long**| UNIX timestamp. Interval initial value. |
 **to** | **kotlin.Long**| UNIX timestamp. Interval end value. |
 **indicator** | **kotlin.String**| Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |
 **indicatorFields** | **kotlin.Any**| Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transcripts"></a>
# **transcripts**
> EarningsCallTranscripts transcripts(id)

Earnings Call Transcripts

&lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. This endpoint is only available for US companies. &lt;p&gt;17+ years of data is available with 170,000+ audio which add up to 6TB in size.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | Transcript's id obtained with <a href=\"#transcripts-list\">Transcripts List endpoint</a>.
try {
    val result : EarningsCallTranscripts = apiInstance.transcripts(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#transcripts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#transcripts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. |

### Return type

[**EarningsCallTranscripts**](EarningsCallTranscripts.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transcriptsList"></a>
# **transcriptsList**
> EarningsCallTranscriptsList transcriptsList(symbol)

Earnings Call Transcripts List

List earnings call transcripts&#39; metadata. This endpoint is only available for US companies.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Company symbol: AAPL. Leave empty to list the latest transcripts
try {
    val result : EarningsCallTranscriptsList = apiInstance.transcriptsList(symbol)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#transcriptsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#transcriptsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Company symbol: AAPL. Leave empty to list the latest transcripts |

### Return type

[**EarningsCallTranscriptsList**](EarningsCallTranscriptsList.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="upgradeDowngrade"></a>
# **upgradeDowngrade**
> kotlin.collections.List&lt;UpgradeDowngrade&gt; upgradeDowngrade(symbol, from, to)

Stock Upgrade/Downgrade

Get latest stock upgrade and downgrade.

### Example
```kotlin
// Import classes:
//import com.finnhub.api.infrastructure.*
//import com.finnhub.api.models.*

val apiInstance = DefaultApi()
val symbol : kotlin.String = symbol_example // kotlin.String | Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades.
val from : kotlin.String = 2013-10-20 // kotlin.String | From date: 2000-03-15.
val to : kotlin.String = 2013-10-20 // kotlin.String | To date: 2020-03-16.
try {
    val result : kotlin.collections.List<UpgradeDowngrade> = apiInstance.upgradeDowngrade(symbol, from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#upgradeDowngrade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#upgradeDowngrade")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **kotlin.String**| Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. | [optional]
 **from** | **kotlin.String**| From date: 2000-03-15. | [optional]
 **to** | **kotlin.String**| To date: 2020-03-16. | [optional]

### Return type

[**kotlin.collections.List&lt;UpgradeDowngrade&gt;**](UpgradeDowngrade.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["token"] = ""
    ApiClient.apiKeyPrefix["token"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

