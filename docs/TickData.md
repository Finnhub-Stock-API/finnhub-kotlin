
# TickData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s** | **kotlin.String** | Symbol. |  [optional]
**skip** | **kotlin.Long** | Number of ticks skipped. |  [optional]
**count** | **kotlin.Long** | Number of ticks returned. If &lt;code&gt;count&lt;/code&gt; &lt; &lt;code&gt;limit&lt;/code&gt;, all data for that date has been returned. |  [optional]
**total** | **kotlin.Long** | Total number of ticks for that date. |  [optional]
**v** | **kotlin.collections.List&lt;kotlin.Float&gt;** | List of volume data. |  [optional]
**p** | **kotlin.collections.List&lt;kotlin.Float&gt;** | List of price data. |  [optional]
**t** | **kotlin.collections.List&lt;kotlin.Long&gt;** | List of timestamp in UNIX ms. |  [optional]
**x** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of venues/exchanges. A list of exchange codes can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp&#x3D;sharing\&quot;,&gt;here&lt;/a&gt; |  [optional]
**c** | **kotlin.collections.List&lt;kotlin.collections.List&lt;kotlin.String&gt;&gt;** | List of trade conditions. A comprehensive list of trade conditions code can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1PUxiSWPHSODbaTaoL2Vef6DgU-yFtlRGZf19oBb9Hp0/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt; |  [optional]



