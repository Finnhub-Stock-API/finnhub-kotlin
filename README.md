# Kotlin client library for Finnhub API

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Installation

Install package

```
repositories {
    jcenter()
}
```

For Maven

```
<dependency>
  <groupId>com.finnhub</groupId>
  <artifactId>kotlin-client</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

For Gradle

```
implementation 'com.finnhub:kotlin-client:1.0.0'
```

## Getting Started

```kotlin
ApiClient.apiKey["token"] = "YOUR API KEY"
val apiClient = DefaultApi()

// Technical Indicator
println(apiClient.technicalIndicator(
    symbol = "AAPL",
    resolution = "D",
    from = 1583098857L,
    to = 1584308457L,
    indicator = "sma",
    indicatorFields = mapOf<String, Any>("timeperiod" to 3)
))

// Stock candles
println(apiClient.stockCandles("AAPL", "D", 1590988249, 1591852249, null))

// Aggregate Indicators
println(apiClient.aggregateIndicator("AAPL", "D"))

// Basic financials
println(apiClient.companyBasicFinancials("AAPL", "margin"))

// Earnings surprises
println(apiClient.companyEarnings("TSLA", limit = 5))

// EPS estimates
println(apiClient.companyEpsEstimates("AMZN", freq = "quarterly"))

// Company Executives
println(apiClient.companyExecutive("AAPL"))

// Company News
// Need to use from instead of from to avoid conflict
println(apiClient.companyNews("AAPL", from = "2020-06-01", to = "2020-06-10"))

// Company Peers
println(apiClient.companyPeers("AAPL"))

// Company Profile
println(apiClient.companyProfile(symbol = "AAPL", isin = null, cusip = null))
println(apiClient.companyProfile(isin = "US0378331005", symbol = null, cusip = null))
println(apiClient.companyProfile(cusip = "037833100", symbol = null, isin = null))

// Company Profile 2
println(apiClient.companyProfile2(symbol = "AAPL", isin = null, cusip = null))

// Revenue Estimates
println(apiClient.companyRevenueEstimates("TSLA", freq = "quarterly"))

// List country
println(apiClient.country())

// Crypto Exchange
println(apiClient.cryptoExchanges())

// Crypto symbols
println(apiClient.cryptoSymbols("BINANCE"))

// Economic data
println(apiClient.economicData("MA-USA-656880"))

// Filings
println(apiClient.filings(
    symbol = "AAPL",
    from = "2020-01-01",
    to = "2020-06-11",
    accessNumber = null,
    cik = null,
    form = null
))

// Financials
println(apiClient.financials("AAPL", "bs", "annual"))

// Financials as reported
println(apiClient.financialsReported(symbol = "AAPL", freq = "annual", accessNumber = null, cik = null))

// Forex exchanges
println(apiClient.forexExchanges())

// Forex all pairs
println(apiClient.forexRates(base = "USD"))

// Forex symbols
println(apiClient.forexSymbols("OANDA"))

// Fund Ownership
println(apiClient.fundOwnership("AMZN", limit = 5))

// General news
println(apiClient.generalNews("forex", minId = "0"))

// Investors ownership
println(apiClient.investorsOwnership("AAPL", limit = 5))

// IPO calendar
println(apiClient.ipoCalendar(from = "2020-05-01", to = "2020-06-01"))

// Major developments
println(apiClient.majorDevelopments("AAPL", from = "2020-01-01", to = "2020-12-31"))

// Pattern recognition
println(apiClient.patternRecognition("AAPL", "D"))

// Price target
println(apiClient.priceTarget("AAPL"))

// Quote
println(apiClient.quote("AAPL"))

// Recommendation trends
println(apiClient.recommendationTrends("AAPL"))

// Stock dividends
println(apiClient.stockDividends("KO", from = "2019-01-01", to = "2020-01-01"))

// Stock symbols
println(apiClient.stockSymbols("US"))

// Transcripts
println(apiClient.transcripts("AAPL_162777"))

// Transcripts list
println(apiClient.transcriptsList("AAPL"))

// Earnings Calendar
println(apiClient.earningsCalendar(from = "2020-06-10", to = "2020-06-30", symbol = "", international = false))

// Covid-19
println(apiClient.covid19())

// Upgrade downgrade
println(apiClient.upgradeDowngrade(symbol = "AAPL", from = "2020-01-01", to = "2020-06-30"))

// Economic code
println(apiClient.economicCode())

// Support resistance
println(apiClient.supportResistance("AAPL", "D"))

// Stock splits
println(apiClient.stockSplits(
    symbol = "AAPL",
    from = "2000-01-01",
    to = "2020-01-01")
)

// Forex candles
println(apiClient.forexCandles("OANDA:EUR_USD", "D", 1590988249, 1591852249))

// Crypto Candles
println(apiClient.cryptoCandles("BINANCE:BTCUSDT", "D", 1590988249, 1591852249))

// Tick Data
println(apiClient.stockTick("AAPL", "2020-03-25", 500, 0))
```

## License

Apache License


