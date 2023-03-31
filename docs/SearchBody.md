
# SearchBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **kotlin.String** | Search query | 
**isins** | **kotlin.String** | List of isin to search, comma separated (Max: 50). |  [optional]
**cusips** | **kotlin.String** | List of cusip to search, comma separated (Max: 50). |  [optional]
**ciks** | **kotlin.String** | List of SEC Center Index Key to search, comma separated (Max: 50). |  [optional]
**sedarIds** | **kotlin.String** | List of SEDAR issuer number to search, comma separated (Max: 50). |  [optional]
**chIds** | **kotlin.String** | List of Companies House number to search, comma separated (Max: 50). |  [optional]
**symbols** | **kotlin.String** | List of symbols to search, comma separated (Max: 50). |  [optional]
**sedols** | **kotlin.String** | List of sedols to search, comma separated (Max: 50). |  [optional]
**sources** | **kotlin.String** | List of sources to search, comma separated (Max: 50). Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**forms** | **kotlin.String** | List of forms to search, comma separated (Max: 50). Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**gics** | **kotlin.String** | List of gics to search, comma separated (Max: 50). Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**naics** | **kotlin.String** | List of sources to search, comma separated (Max: 50). Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**exhibits** | **kotlin.String** | List of exhibits to search, comma separated (Max: 50). Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**exchanges** | **kotlin.String** | List of exchanges to search, comma separated (Max: 50). Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**countries** | **kotlin.String** | List of sources to search, comma separated (Max: 50). Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**acts** | **kotlin.String** | List of SEC&#39;s exchanges act to search, comma separated. Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**caps** | **kotlin.String** | List of market capitalization to search, comma separated. Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**fromDate** | **kotlin.String** | Search from date in format: YYYY-MM-DD, default from the last 2 years |  [optional]
**toDate** | **kotlin.String** | Search to date in format: YYYY-MM-DD, default to today |  [optional]
**page** | **kotlin.String** | Use for pagination, default to page 1 |  [optional]
**sort** | **kotlin.String** | Sort result by, default: sortMostRecent. Look at &lt;code&gt;/filter&lt;/code&gt; endpoint to see all available values. |  [optional]
**highlighted** | **kotlin.Boolean** | Enable highlight in returned filings. If enabled, only return 10 results each time |  [optional]



