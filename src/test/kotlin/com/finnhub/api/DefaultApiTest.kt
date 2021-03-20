package com.finnhub.api

import com.finnhub.api.apis.DefaultApi
import com.finnhub.api.infrastructure.ApiClient
import org.junit.Ignore
import org.junit.Test

class DefaultApiTest {


    private val apiClient: DefaultApi

    init {
        ApiClient.apiKey["token"] = "sandbox_c124g8n48v6p2grlmca0"
        apiClient = DefaultApi()
    }

    @Test
    @Ignore
    fun technicalIndicator() {
        println(apiClient.technicalIndicator(
            symbol = "AAPL",
            resolution = "D",
            from = 1583098857L,
            to = 1584308457L,
            indicator = "sma",
            indicatorFields = mapOf<String, Any>("timeperiod" to 3)
        ))
    }

    @Test
    @Ignore
    fun stockCandles() {
        println(apiClient.stockCandles("AAPL", "D", 1590988249, 1591852249, null))
    }

    @Test
    @Ignore
    fun aggregateIndicator() {
        println(apiClient.aggregateIndicator("AAPL", "D"))
    }

    @Test
    @Ignore
    fun basicFinancials() {
        println(apiClient.companyBasicFinancials("AAPL", "margin"))
    }

    @Test
    @Ignore
    fun companyEarnings() {
        println(apiClient.companyEarnings("TSLA", limit = 5))
    }

    @Test
    @Ignore
    fun companyEpsEstimates() {
        println(apiClient.companyEpsEstimates("AMZN", freq = "quarterly"))
    }

    @Test
    @Ignore
    fun companyExecutive() {
        println(apiClient.companyExecutive("AAPL"))
    }

    @Test
    @Ignore
    fun companyNews() {
        println(apiClient.companyNews("AAPL", from = "2020-06-01", to = "2020-06-10"))
    }

    @Test
    @Ignore
    fun companyPeers() {
        println(apiClient.companyPeers("AAPL"))
    }

    @Test
    @Ignore
    fun companyProfile() {
        println(apiClient.companyProfile(symbol = "AAPL", isin = null, cusip = null))
        println(apiClient.companyProfile(isin = "US0378331005", symbol = null, cusip = null))
        println(apiClient.companyProfile(cusip = "037833100", symbol = null, isin = null))
    }

    @Test
    @Ignore
    fun companyProfile2() {
        println(apiClient.companyProfile2(symbol = "AAPL", isin = null, cusip = null))
    }

    @Test
    @Ignore
    fun companyRevenueEstimates() {
        println(apiClient.companyRevenueEstimates("TSLA", freq = "quarterly"))
    }

    @Test
    @Ignore
    fun country() {
        println(apiClient.country())
    }

    @Test
    @Ignore
    fun cryptoExchange() {
        println(apiClient.cryptoExchanges())
    }

    @Test
    @Ignore
    fun cryptoSymbols() {
        println(apiClient.cryptoSymbols("BINANCE"))
    }

    @Test
    @Ignore
    fun economicData() {
        println(apiClient.economicData("MA-USA-656880"))
    }

    @Test
    @Ignore
    fun filings() {
        println(apiClient.filings(
            symbol = "AAPL",
            from = "2020-01-01",
            to = "2020-06-11",
            accessNumber = null,
            cik = null,
            form = null
        ))
    }

    @Test
    @Ignore
    fun financials() {
        println(apiClient.financials("AAPL", "bs", "annual"))
    }

    @Test
    @Ignore
    fun financialsReported() {
        println(apiClient.financialsReported(symbol = "AAPL", freq = "annual", accessNumber = null, cik = null))
    }

    @Test
    @Ignore
    fun forexExchanges() {
        println(apiClient.forexExchanges())
    }

    @Test
    @Ignore
    fun forexRates() {
        println(apiClient.forexRates(base = "USD"))
    }

    @Test
    @Ignore
    fun forexSymbols() {
        println(apiClient.forexSymbols("OANDA"))
    }

    @Test
    @Ignore
    fun fundOwnership() {
        println(apiClient.fundOwnership("AMZN", limit = 5))
    }

    @Test
    @Ignore
    fun generalNews() {
        println(apiClient.generalNews("forex", minId = "0"))
    }

    @Test
    @Ignore
    fun investorsOwnership() {
        println(apiClient.investorsOwnership("AAPL", limit = 5))
    }

    @Test
    @Ignore
    fun ipoCalendar() {
        println(apiClient.ipoCalendar(from = "2020-05-01", to = "2020-06-01"))
    }

    @Test
    @Ignore
    fun majorDevelopments() {
        println(apiClient.majorDevelopments("AAPL", from = "2020-01-01", to = "2020-12-31"))
    }

    @Test
    @Ignore
    fun patternRecognition() {
        println(apiClient.patternRecognition("AAPL", "D"))
    }

    @Test
    @Ignore
    fun priceTarget() {
        println(apiClient.priceTarget("AAPL"))
    }

    @Test
    @Ignore
    fun quote() {
        println(apiClient.quote("AAPL"))
    }

    @Test
    @Ignore
    fun recommendationTrends() {
        println(apiClient.recommendationTrends("AAPL"))
    }

    @Test
    @Ignore
    fun stockDividends() {
        println(apiClient.stockDividends("KO", from = "2019-01-01", to = "2020-01-01"))
    }

    @Test
    @Ignore
    fun stockSymbols() {
        println(apiClient.stockSymbols("US"))
    }

    @Test
    @Ignore
    fun transcripts() {
        println(apiClient.transcripts("AAPL_162777"))
    }

    @Test
    @Ignore
    fun transcriptsList() {
        println(apiClient.transcriptsList("AAPL"))
    }

    @Test
    @Ignore
    fun earningsCalendar() {
        println(apiClient.earningsCalendar(from = "2020-06-10", to = "2020-06-30", symbol = "", international = false))
    }

    @Test
    @Ignore
    fun covid19() {
        println(apiClient.covid19())
    }

    @Test
    @Ignore
    fun upgradeDowngrade() {
        println(apiClient.upgradeDowngrade(symbol = "AAPL", from = "2020-01-01", to = "2020-06-30"))
    }

    @Test
    @Ignore
    fun economicCode() {
        println(apiClient.economicCode())
    }

    @Test
    @Ignore
    fun supportResistance() {
        println(apiClient.supportResistance("AAPL", "D"))
    }

    @Test
    @Ignore
    fun stockSplits() {
        println(apiClient.stockSplits(
            symbol = "AAPL",
            from = "2000-01-01",
            to = "2020-01-01")
        )
    }

    @Test
    @Ignore
    fun forexCandles() {
        println(apiClient.forexCandles("OANDA:EUR_USD", "D", 1590988249, 1591852249))
    }

    @Test
    @Ignore
    fun cryptoCandles() {
        println(apiClient.cryptoCandles("BINANCE:BTCUSDT", "D", 1590988249, 1591852249))
    }

    @Test
    @Ignore
    fun stockTick() {
        println(apiClient.stockTick("AAPL", "2020-03-25", 500, 0))
    }

    @Test
    @Ignore
    fun indicesConstituents() {
        println(apiClient.indicesConstituents("^GSPC"))
    }

    @Test
    @Ignore
    fun indicesHistoricalConstituents() {
        println(apiClient.indicesHistoricalConstituents("^GSPC"))
    }

    @Test
    @Ignore
    fun etfsProfile() {
        println(apiClient.etfsProfile("SPY"))
    }

    @Test
    @Ignore
    fun etfsHoldings() {
        println(apiClient.etfsHoldings("SPY"))
    }

    @Test
    @Ignore
    fun etfsIndustryExposure() {
        println(apiClient.etfsIndustryExposure("SPY"))
    }

    @Test
    @Ignore
    fun etfsCountryExposure() {
        println(apiClient.etfsCountryExposure("SPY"))
    }
}
