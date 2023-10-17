package io.finnhub.api

import io.finnhub.api.apis.DefaultApi
import io.finnhub.api.infrastructure.ApiClient
import org.junit.Ignore
import org.junit.Test

class DefaultApiTest {
    private val apiClient: DefaultApi

    init {
        ApiClient.apiKey["token"] = System.getenv("FINNHUB_API_KEY") // Replace with your API key
        apiClient = DefaultApi()
    }

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
        println(apiClient.stockCandles("AAPL", "D", 1590988249, 1591852249))
    }

    @Test
    fun stockBidask() {
        println(apiClient.stockBidask("AAPL"))
    }

    @Test
    fun aggregateIndicator() {
        println(apiClient.aggregateIndicator("AAPL", "D"))
    }

    @Test
    fun basicFinancials() {
        println(apiClient.companyBasicFinancials("AAPL", "all"))
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
    fun newsSentiment() {
        println(apiClient.newsSentiment("AAPL"))
    }

    @Test
    fun companyPeers() {
        println(apiClient.companyPeers("AAPL", "industry"))
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
    fun filingsSentiment() {
        println(apiClient.filingsSentiment("0000320193-20-000052"))
    }

    @Test
    fun similarityIndex() {
        println(apiClient.similarityIndex("AAPL", "", "annual"))
    }

    @Test
    fun financials() {
        println(apiClient.financials("AAPL", "bs", "annual"))
    }

    @Test
    fun financialsReported() {
        println(
            apiClient.financialsReported(
                symbol = "AAPL",
                freq = "annual",
                accessNumber = null,
                cik = null,
                from = "",
                to = ""
            )
        )
    }

    @Test
    fun forexExchanges() {
        println(apiClient.forexExchanges())
    }

    @Test
    fun forexRates() {
        println(apiClient.forexRates(base = "USD", date = ""))
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
        println(apiClient.marketNews("forex", minId = 0))
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

    @Test
    fun patternRecognition() {
        println(apiClient.patternRecognition("AAPL", "D"))
    }

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
        var dividend = apiClient.stockDividends("KO", from = "2019-01-01", to = "2020-01-01")
        println(dividend[0].symbol)
        println(dividend[0].amount)
    }

    @Test
    fun stockDividends2() {
        println(apiClient.stockBasicDividends("KO"))
    }

    @Test
    fun stockSymbols() {
        var a = apiClient.stockSymbols("US", "", "", "")
        println(a[0].displaySymbol)
        println(a[0].description)
    }

    @Test
    fun transcripts() {
        println(apiClient.transcripts("AAPL_162777"))
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
    fun fdaCalendar() {
        println(apiClient.fdaCommitteeMeetingCalendar())
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
    fun economicCalendar() {
        println(apiClient.economicCalendar(from = "2021-11-24", to = "2021-11-26"))
    }

    @Test
    fun supportResistance() {
        println(apiClient.supportResistance("AAPL", "D"))
    }

    @Test
    fun stockSplits() {
        println(apiClient.stockSplits(symbol = "AAPL", from = "2000-01-01", to = "2020-01-01"))
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
        println(apiClient.stockTick("AAPL", "2021-03-25", 50, 0))
    }

    @Test
    fun stockBBO() {
        println(apiClient.stockNbbo("AAPL", "2021-03-25", 50, 0))
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
        println(apiClient.etfsHoldings("SPY", "", 0, ""))
    }

    @Test
    fun etfsSectorExposure() {
        println(apiClient.etfsSectorExposure("SPY", ""))
    }

    @Test
    fun etfsCountryExposure() {
        println(apiClient.etfsCountryExposure("SPY", ""))
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
        println(apiClient.mutualFundSectorExposure("VTSAX", ""))
    }

    @Test
    fun mutualFundCountryExposure() {
        println(apiClient.mutualFundCountryExposure("VTSAX", ""))
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
        println(apiClient.investmentThemes("financialExchangesData"))
    }

    @Test
    fun socialSentiment() {
        println(apiClient.socialSentiment("GME", "", ""))
    }

    @Test
    fun supplyChain() {
        println(apiClient.supplyChainRelationships("AAPL"))
    }

    @Test
    fun symbolSearch() {
        println(apiClient.symbolSearch("AAPL"))
    }

    @Test
    fun companyESG() {
        println(apiClient.companyEsgScore("AAPL"))
    }

    @Test
    fun companyEarningsQualityScore() {
        println(apiClient.companyEarningsQualityScore("AAPL", "quarterly"))
    }

    @Test
    fun cryptoProfile() {
        println(apiClient.cryptoProfile("BTC"))
    }

    @Test
    fun companyEbitdaEstimates() {
        println(apiClient.companyEbitdaEstimates("AAPL", freq = "quarterly"))
    }

    @Test
    fun companyEbitEstimates() {
        println(apiClient.companyEbitEstimates("TSLA", freq = "annual"))
    }

    @Test
    fun stockUsptoPatent() {
        println(apiClient.stockUsptoPatent("NVDA", "2021-01-01", "2021-12-31"))
    }

    @Test
    fun stockVisaApplication() {
        println(apiClient.stockVisaApplication("AAPL", "2019-01-01", "2021-12-31"))
    }

    @Test
    fun insiderSentiment() {
        println(apiClient.insiderSentiment("AAPL", "2019-01-01", "2022-12-31"))
    }

    @Test
    fun stockLobbying() {
        println(apiClient.stockLobbying("AAPL", "2019-01-01", "2022-12-31"))
    }

    @Test
    fun bondProfile() {
        println(apiClient.bondProfile(isin = "US912810TD00", cusip = null, figi = null))
    }

    @Test
    fun bondPrice() {
        println(apiClient.bondPrice("US912810TD00", 1590988249, 1649099548))
    }

    @Test
    fun stockUsaSpending() {
        println(apiClient.stockUsaSpending("AAPL", from = "2020-06-01", to = "2022-06-10"))
    }

    @Test
    fun sectorMetric() {
        println(apiClient.sectorMetric("NA"))
    }

    @Test
    fun priceMetric() {
        println(apiClient.priceMetrics("AAPL", "2022-02-22"))
    }

    @Test
    fun symbolChange() {
        println(apiClient.symbolChange(from = "2022-06-01", to = "2022-06-10"))
    }

    @Test
    fun isinChange() {
        println(apiClient.isinChange(from = "2022-06-01", to = "2022-06-10"))
    }

    @Test
    fun institutionalProfile() {
        println(apiClient.institutionalProfile(""))
    }

    @Test
    fun institutionalPortfolio() {
        println(apiClient.institutionalPortfolio("1000097", from = "2022-06-01", to = "2022-09-10"))
    }

    @Test
    fun institutionalOwnership() {
        println(apiClient.institutionalOwnership("TSLA", "", from = "2022-06-01", to = "2022-09-10"))
    }

    @Test
    fun congressionalTrading() {
        println(apiClient.congressionalTrading("TSLA", from = "2015-06-01", to = "2023-09-10"))
    }

    @Test
    fun bondTick() {
        println(apiClient.bondTick("US693475BF18", "2022-08-19", 50, 0, "exchange"))
    }

    @Test
    fun bondYield() {
        println(apiClient.bondYieldCurve("10y"))
    }

    @Test
    fun marketHoliday() {
        println(apiClient.marketHoliday("US"))
    }

    @Test
    fun marketStatus() {
        println(apiClient.marketStatus("US"))
    }
}
