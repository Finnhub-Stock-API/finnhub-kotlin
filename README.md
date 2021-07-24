# Kotlin client library for Finnhub API

## Requires

- Kotlin 1.3.41
- Gradle 4.9

## Installation

Install package

```
repositories {
    mavenCentral()
}
```

For Maven

```
<dependency>
  <groupId>io.finnhub</groupId>
  <artifactId>kotlin-client</artifactId>
  <version>2.0.0</version>
  <type>pom</type>
</dependency>
```

For Gradle

```
implementation 'io.finnhub:kotlin-client:2.0.0'
```

## Migrate from 1.x.x to 2.x.x

- Due to recent sunset of Bintray we have migrated the library to Maven
- For users who have already been using the library from `1.x.x` please change package from `com.finnhub`
  to `io.finnhub`

## Getting Started

```kotlin
import io.finnhub.api.apis.DefaultApi
import io.finnhub.api.infrastructure.ApiClient

ApiClient.apiKey["token"] = "YOUR API KEY"
val apiClient = DefaultApi()

@Test
fun technicalIndicator() {
  println(
    apiClient.technicalIndicator(
      symbol = "AAPL",
      resolution = "D",
      from = 1583098857L,
      to = 1584308457L,
      indicator = "sma",
      indicatorFields = mapOf<String, Any>("timeperiod" to 3)
    )
  )
}

@Test
fun stockCandles() {
  println(apiClient.stockCandles("AAPL", "D", 1590988249, 1591852249, null))
}

@Test
fun aggregateIndicator() {
  println(apiClient.aggregateIndicator("AAPL", "D"))
}

@Test
fun basicFinancials() {
  println(apiClient.companyBasicFinancials("AAPL", "margin"))
}

@Test
fun companyEarnings() {
  println(apiClient.companyEarnings("TSLA", limit = 5))
}

@Test
fun companyEpsEstimates() {
  println(apiClient.companyEpsEstimates("AMZN", freq = "quarterly"))
}

@Test
fun companyExecutive() {
  println(apiClient.companyExecutive("AAPL"))
}

@Test
fun companyNews() {
  println(apiClient.companyNews("AAPL", from = "2020-06-01", to = "2020-06-10"))
}

@Test
fun companyPeers() {
  println(apiClient.companyPeers("AAPL"))
}

@Test
fun companyProfile() {
  println(apiClient.companyProfile(symbol = "AAPL", isin = null, cusip = null))
  println(apiClient.companyProfile(isin = "US0378331005", symbol = null, cusip = null))
  println(apiClient.companyProfile(cusip = "037833100", symbol = null, isin = null))
}

@Test
fun companyProfile2() {
  println(apiClient.companyProfile2(symbol = "AAPL", isin = null, cusip = null))
}

@Test
fun companyRevenueEstimates() {
  println(apiClient.companyRevenueEstimates("TSLA", freq = "quarterly"))
}

@Test
fun country() {
  println(apiClient.country())
}

@Test
fun cryptoExchange() {
  println(apiClient.cryptoExchanges())
}

@Test
fun cryptoSymbols() {
  println(apiClient.cryptoSymbols("BINANCE"))
}

@Test
fun economicData() {
  println(apiClient.economicData("MA-USA-656880"))
}

@Test
fun filings() {
  println(
    apiClient.filings(
      symbol = "AAPL",
      from = "2020-01-01",
      to = "2020-06-11",
      accessNumber = null,
      cik = null,
      form = null
    )
  )
}

@Test
fun financials() {
  println(apiClient.financials("AAPL", "bs", "annual"))
}

@Test
fun financialsReported() {
  println(apiClient.financialsReported(symbol = "AAPL", freq = "annual", accessNumber = null, cik = null))
}

@Test
fun forexExchanges() {
  println(apiClient.forexExchanges())
}

@Test
fun forexRates() {
  println(apiClient.forexRates(base = "USD"))
}

@Test
fun forexSymbols() {
  println(apiClient.forexSymbols("OANDA"))
}

@Test
fun fundOwnership() {
  println(apiClient.fundOwnership("AMZN", limit = 5))
}

@Test
fun generalNews() {
  println(apiClient.marketNews("forex", minId = "0"))
}

@Test
fun investorsOwnership() {
  println(apiClient.ownership("AAPL", limit = 5))
}

@Test
fun ipoCalendar() {
  println(apiClient.ipoCalendar(from = "2020-05-01", to = "2020-06-01"))
}

@Test
fun majorDevelopments() {
  println(apiClient.pressReleases("AAPL", from = "2020-01-01", to = "2020-12-31"))
}

//@Test
//fun patternRecognition() {
//    println(apiClient.patternRecognition("AAPL", "D"))
//}

@Test
fun priceTarget() {
  println(apiClient.priceTarget("AAPL"))
}

@Test
fun quote() {
  println(apiClient.quote("AAPL"))
}

@Test
fun recommendationTrends() {
  println(apiClient.recommendationTrends("AAPL"))
}

@Test
fun stockDividends() {
  println(apiClient.stockDividends("KO", from = "2019-01-01", to = "2020-01-01"))
}

@Test
fun stockSymbols() {
  println(apiClient.stockSymbols("US", "", "", ""))
}

@Test
fun transcripts() {
  println(apiClient.earningsCallTranscriptsApi("AAPL_162777"))
}

@Test
fun transcriptsList() {
  println(apiClient.transcriptsList("AAPL"))
}

@Test
fun earningsCalendar() {
  println(apiClient.earningsCalendar(from = "2020-06-10", to = "2020-06-30", symbol = "", international = false))
}

@Test
fun covid19() {
  println(apiClient.covid19())
}

@Test
fun upgradeDowngrade() {
  println(apiClient.upgradeDowngrade(symbol = "AAPL", from = "2020-01-01", to = "2020-06-30"))
}

@Test
fun economicCode() {
  println(apiClient.economicCode())
}

@Test
fun supportResistance() {
  println(apiClient.supportResistance("AAPL", "D"))
}

@Test
fun stockSplits() {
  println(
    apiClient.stockSplits(
      symbol = "AAPL",
      from = "2000-01-01",
      to = "2020-01-01"
    )
  )
}

@Test
fun forexCandles() {
  println(apiClient.forexCandles("OANDA:EUR_USD", "D", 1590988249, 1591852249))
}

@Test
fun cryptoCandles() {
  println(apiClient.cryptoCandles("BINANCE:BTCUSDT", "D", 1590988249, 1591852249))
}

@Test
fun stockTick() {
  println(apiClient.stockTick("AAPL", "2020-03-25", 500, 0))
}

@Test
fun indicesConstituents() {
  println(apiClient.indicesConstituents("^GSPC"))
}

@Test
fun indicesHistoricalConstituents() {
  println(apiClient.indicesHistoricalConstituents("^GSPC"))
}

@Test
fun etfsProfile() {
  println(apiClient.etfsProfile("SPY", ""))
}

@Test
fun etfsHoldings() {
  println(apiClient.etfsHoldings("SPY", "", 0))
}

@Test
fun etfsSectorExposure() {
  println(apiClient.etfsSectorExposure("SPY"))
}

@Test
fun etfsCountryExposure() {
  println(apiClient.etfsCountryExposure("SPY"))
}

@Test
fun mutualFundProfile() {
  println(apiClient.mutualFundProfile("VTSAX", ""))
}

@Test
fun mutualFundHoldings() {
  println(apiClient.mutualFundHoldings("VTSAX", "", 0))
}

@Test
fun mutualFundSectorExposure() {
  println(apiClient.mutualFundSectorExposure("VTSAX"))
}

@Test
fun mutualFundCountryExposure() {
  println(apiClient.mutualFundCountryExposure("VTSAX"))
}

@Test
fun insiderTransactions() {
  println(apiClient.insiderTransactions("AAPL", "2021-01-01", "2021-07-07"))
}

@Test
fun revenueBreakdown() {
  println(apiClient.revenueBreakdown("AAPL", ""))
}

@Test
fun investmentTheme() {
  println(apiClient.investmentThemesThematicInvesting("financialExchangesData"))
}

@Test
fun socialSentiment() {
  println(apiClient.socialSentiment("GME", "", ""))
}

@Test
fun supplyChain() {
  println(apiClient.supplyChainRelationships("AAPL"))
}
```

## License

Apache License
