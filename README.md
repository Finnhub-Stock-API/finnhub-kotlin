# com.finnhub.api - Kotlin client library for Finnhub API

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://finnhub.io/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**aggregateIndicator**](docs/DefaultApi.md#aggregateindicator) | **GET** /scan/technical-indicator | Aggregate Indicators
*DefaultApi* | [**companyBasicFinancials**](docs/DefaultApi.md#companybasicfinancials) | **GET** /stock/metric | Basic Financials
*DefaultApi* | [**companyEarnings**](docs/DefaultApi.md#companyearnings) | **GET** /stock/earnings | Earnings Surprises
*DefaultApi* | [**companyEpsEstimates**](docs/DefaultApi.md#companyepsestimates) | **GET** /stock/eps-estimate | Earnings Estimates
*DefaultApi* | [**companyExecutive**](docs/DefaultApi.md#companyexecutive) | **GET** /stock/executive | Company Executive
*DefaultApi* | [**companyNews**](docs/DefaultApi.md#companynews) | **GET** /company-news | Company News
*DefaultApi* | [**companyPeers**](docs/DefaultApi.md#companypeers) | **GET** /stock/peers | Peers
*DefaultApi* | [**companyProfile**](docs/DefaultApi.md#companyprofile) | **GET** /stock/profile | Company Profile
*DefaultApi* | [**companyProfile2**](docs/DefaultApi.md#companyprofile2) | **GET** /stock/profile2 | Company Profile 2
*DefaultApi* | [**companyRevenueEstimates**](docs/DefaultApi.md#companyrevenueestimates) | **GET** /stock/revenue-estimate | Revenue Estimates
*DefaultApi* | [**country**](docs/DefaultApi.md#country) | **GET** /country | Country Metadata
*DefaultApi* | [**covid19**](docs/DefaultApi.md#covid19) | **GET** /covid19/us | COVID-19
*DefaultApi* | [**cryptoCandles**](docs/DefaultApi.md#cryptocandles) | **GET** /crypto/candle | Crypto Candles
*DefaultApi* | [**cryptoExchanges**](docs/DefaultApi.md#cryptoexchanges) | **GET** /crypto/exchange | Crypto Exchanges
*DefaultApi* | [**cryptoSymbols**](docs/DefaultApi.md#cryptosymbols) | **GET** /crypto/symbol | Crypto Symbol
*DefaultApi* | [**earningsCalendar**](docs/DefaultApi.md#earningscalendar) | **GET** /calendar/earnings | Earnings Calendar
*DefaultApi* | [**economicCode**](docs/DefaultApi.md#economiccode) | **GET** /economic/code | Economic Code
*DefaultApi* | [**economicData**](docs/DefaultApi.md#economicdata) | **GET** /economic | Economic Data
*DefaultApi* | [**filings**](docs/DefaultApi.md#filings) | **GET** /stock/filings | Filings
*DefaultApi* | [**financials**](docs/DefaultApi.md#financials) | **GET** /stock/financials | Financial Statements
*DefaultApi* | [**financialsReported**](docs/DefaultApi.md#financialsreported) | **GET** /stock/financials-reported | Financials As Reported
*DefaultApi* | [**forexCandles**](docs/DefaultApi.md#forexcandles) | **GET** /forex/candle | Forex Candles
*DefaultApi* | [**forexExchanges**](docs/DefaultApi.md#forexexchanges) | **GET** /forex/exchange | Forex Exchanges
*DefaultApi* | [**forexRates**](docs/DefaultApi.md#forexrates) | **GET** /forex/rates | Forex rates
*DefaultApi* | [**forexSymbols**](docs/DefaultApi.md#forexsymbols) | **GET** /forex/symbol | Forex Symbol
*DefaultApi* | [**fundOwnership**](docs/DefaultApi.md#fundownership) | **GET** /stock/fund-ownership | Fund Ownership
*DefaultApi* | [**generalNews**](docs/DefaultApi.md#generalnews) | **GET** /news | General News
*DefaultApi* | [**investorsOwnership**](docs/DefaultApi.md#investorsownership) | **GET** /stock/investor-ownership | Investors Ownership
*DefaultApi* | [**ipoCalendar**](docs/DefaultApi.md#ipocalendar) | **GET** /calendar/ipo | IPO Calendar
*DefaultApi* | [**majorDevelopments**](docs/DefaultApi.md#majordevelopments) | **GET** /major-development | Major Developments
*DefaultApi* | [**newsSentiment**](docs/DefaultApi.md#newssentiment) | **GET** /news-sentiment | News Sentiment
*DefaultApi* | [**patternRecognition**](docs/DefaultApi.md#patternrecognition) | **GET** /scan/pattern | Pattern Recognition
*DefaultApi* | [**priceTarget**](docs/DefaultApi.md#pricetarget) | **GET** /stock/price-target | Price Target
*DefaultApi* | [**quote**](docs/DefaultApi.md#quote) | **GET** /quote | Quote
*DefaultApi* | [**recommendationTrends**](docs/DefaultApi.md#recommendationtrends) | **GET** /stock/recommendation | Recommendation Trends
*DefaultApi* | [**stockBidask**](docs/DefaultApi.md#stockbidask) | **GET** /stock/bidask | Last Bid-Ask
*DefaultApi* | [**stockCandles**](docs/DefaultApi.md#stockcandles) | **GET** /stock/candle | Stock Candles
*DefaultApi* | [**stockDividends**](docs/DefaultApi.md#stockdividends) | **GET** /stock/dividend | Dividends
*DefaultApi* | [**stockSplits**](docs/DefaultApi.md#stocksplits) | **GET** /stock/split | Splits
*DefaultApi* | [**stockSymbols**](docs/DefaultApi.md#stocksymbols) | **GET** /stock/symbol | Stock Symbol
*DefaultApi* | [**stockTick**](docs/DefaultApi.md#stocktick) | **GET** /stock/tick | Tick Data
*DefaultApi* | [**supportResistance**](docs/DefaultApi.md#supportresistance) | **GET** /scan/support-resistance | Support/Resistance
*DefaultApi* | [**technicalIndicator**](docs/DefaultApi.md#technicalindicator) | **POST** /indicator | Technical Indicators
*DefaultApi* | [**transcripts**](docs/DefaultApi.md#transcripts) | **GET** /stock/transcripts | Earnings Call Transcripts
*DefaultApi* | [**transcriptsList**](docs/DefaultApi.md#transcriptslist) | **GET** /stock/transcripts/list | Earnings Call Transcripts List
*DefaultApi* | [**upgradeDowngrade**](docs/DefaultApi.md#upgradedowngrade) | **GET** /stock/upgrade-downgrade | Stock Upgrade/Downgrade


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.finnhub.api.models.AggregateIndicators](docs/AggregateIndicators.md)
 - [com.finnhub.api.models.BasicFinancials](docs/BasicFinancials.md)
 - [com.finnhub.api.models.Company](docs/Company.md)
 - [com.finnhub.api.models.CompanyExecutive](docs/CompanyExecutive.md)
 - [com.finnhub.api.models.CompanyNewsStatistics](docs/CompanyNewsStatistics.md)
 - [com.finnhub.api.models.CompanyProfile](docs/CompanyProfile.md)
 - [com.finnhub.api.models.CompanyProfile2](docs/CompanyProfile2.md)
 - [com.finnhub.api.models.CountryMetadata](docs/CountryMetadata.md)
 - [com.finnhub.api.models.CovidInfo](docs/CovidInfo.md)
 - [com.finnhub.api.models.CryptoCandles](docs/CryptoCandles.md)
 - [com.finnhub.api.models.CryptoSymbol](docs/CryptoSymbol.md)
 - [com.finnhub.api.models.Development](docs/Development.md)
 - [com.finnhub.api.models.Dividends](docs/Dividends.md)
 - [com.finnhub.api.models.EarningEstimate](docs/EarningEstimate.md)
 - [com.finnhub.api.models.EarningRelease](docs/EarningRelease.md)
 - [com.finnhub.api.models.EarningResult](docs/EarningResult.md)
 - [com.finnhub.api.models.EarningsCalendar](docs/EarningsCalendar.md)
 - [com.finnhub.api.models.EarningsCallTranscripts](docs/EarningsCallTranscripts.md)
 - [com.finnhub.api.models.EarningsCallTranscriptsList](docs/EarningsCallTranscriptsList.md)
 - [com.finnhub.api.models.EarningsEstimates](docs/EarningsEstimates.md)
 - [com.finnhub.api.models.EconomicCalendar](docs/EconomicCalendar.md)
 - [com.finnhub.api.models.EconomicCode](docs/EconomicCode.md)
 - [com.finnhub.api.models.EconomicData](docs/EconomicData.md)
 - [com.finnhub.api.models.EconomicEvent](docs/EconomicEvent.md)
 - [com.finnhub.api.models.Estimate](docs/Estimate.md)
 - [com.finnhub.api.models.Filing](docs/Filing.md)
 - [com.finnhub.api.models.FinancialStatements](docs/FinancialStatements.md)
 - [com.finnhub.api.models.FinancialsAsReported](docs/FinancialsAsReported.md)
 - [com.finnhub.api.models.ForexCandles](docs/ForexCandles.md)
 - [com.finnhub.api.models.ForexSymbol](docs/ForexSymbol.md)
 - [com.finnhub.api.models.Forexrates](docs/Forexrates.md)
 - [com.finnhub.api.models.FundOwnership](docs/FundOwnership.md)
 - [com.finnhub.api.models.IPOCalendar](docs/IPOCalendar.md)
 - [com.finnhub.api.models.IPOEvent](docs/IPOEvent.md)
 - [com.finnhub.api.models.Indicator](docs/Indicator.md)
 - [com.finnhub.api.models.Investor](docs/Investor.md)
 - [com.finnhub.api.models.InvestorsOwnership](docs/InvestorsOwnership.md)
 - [com.finnhub.api.models.LastBidMinusAsk](docs/LastBidMinusAsk.md)
 - [com.finnhub.api.models.MajorDevelopments](docs/MajorDevelopments.md)
 - [com.finnhub.api.models.News](docs/News.md)
 - [com.finnhub.api.models.NewsSentiment](docs/NewsSentiment.md)
 - [com.finnhub.api.models.PatternRecognition](docs/PatternRecognition.md)
 - [com.finnhub.api.models.PriceTarget](docs/PriceTarget.md)
 - [com.finnhub.api.models.Quote](docs/Quote.md)
 - [com.finnhub.api.models.RecommendationTrend](docs/RecommendationTrend.md)
 - [com.finnhub.api.models.Report](docs/Report.md)
 - [com.finnhub.api.models.RevenueEstimates](docs/RevenueEstimates.md)
 - [com.finnhub.api.models.Sentiment](docs/Sentiment.md)
 - [com.finnhub.api.models.Split](docs/Split.md)
 - [com.finnhub.api.models.Stock](docs/Stock.md)
 - [com.finnhub.api.models.StockCandles](docs/StockCandles.md)
 - [com.finnhub.api.models.StockTranscripts](docs/StockTranscripts.md)
 - [com.finnhub.api.models.SupportResistance](docs/SupportResistance.md)
 - [com.finnhub.api.models.TechnicalAnalysis](docs/TechnicalAnalysis.md)
 - [com.finnhub.api.models.TickData](docs/TickData.md)
 - [com.finnhub.api.models.TranscriptContent](docs/TranscriptContent.md)
 - [com.finnhub.api.models.TranscriptParticipant](docs/TranscriptParticipant.md)
 - [com.finnhub.api.models.Trend](docs/Trend.md)
 - [com.finnhub.api.models.UpgradeDowngrade](docs/UpgradeDowngrade.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: token
- **Location**: URL query string

