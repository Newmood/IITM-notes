Mostly links to refer to for each section.

## Contents
1. [Module 1: Discover the data](#module-1-discover-the-data)
2. [Module 2: Get the data](#module-2-get-the-data)
3. [Module 3: Prepare the data](#module-3-prepare-the-data)
4. [Module 4a: Model the data](#module-4a-model-the-data)
5. [Module 4b: Model the data](#module-4b-model-the-data)
6. [Module 5a: Deep Learning Models](#module-5a-deep-learning-models)
7. [Module 5b: Deep Learning Models](#module-5b-deep-learning-models)
8. [Module 6a: Design your output](#module-6a-design-your-output)
9. [Module 6b: Design your output](#module-6b-design-your-output)

## Module 1: Discover the data
There are three types of data: 
1. Public: All openly public data available in internet.
2. Private: Data belonging to an organisation (might be available to people if they pay for it)
3. Personal: Data that belongs to an individual, music playlists, call logs, messaging data.

Some public data sources:
1. [Awesome public](https://github.com/awesomedata/awesome-public-datasets)
2. [Google dataset search](https://datasetsearch.research.google.com/)
3. [Kaggle datasets](https://www.kaggle.com/datasets/)
4. [Data.gov](https://data.govhttps://data.gov.in)
5. [Datameet](https://datameet.org/)

Types of datasets:
1. Structured have specific schema, example: databases, speadsheets, shapefiles
2. Semi-structured have flexible schema, not properly defined, Documents (pdf,html), messages(email,sms), containers(zip,docx), json files
3. Unstructured has no schema text, images, audio, video

Types of datavalues:
1. Categorical: Boolean, Unordered (Red,Blue,Green), Ordered (Low,Medium,High), Unstructured (text,Binary)
2. Numerical: Integers, Real
3. Composite: Date/time, Spatial(Lat/long,shapes), structured(json files), Specialised (IP,
currency)

## Module 2: Get the data
We mostly download, scrape or query data to get it. Scraping may always not be legal.
Following resources are helpful:
1. [JSON](https://pymotw.com/3/json/index.html)  
   Check out [PyDocs](https://docs.python.org/3/library/json.html), watch video by [Socratica](https://www.youtube.com/watch?v=pTT7HMqDnJw)
2. [urllib.parse](https://pymotw.com/3/urllib.parse/index.html)  
   Check out [PyDocs](https://docs.python.org/3/library/urllib.parse.html), watch video by [Socratica](https://www.youtube.com/watch?v=LosIGgon_KM)
3. [os](https://pymotw.com/3/os/index.html)  
   Check out [PyDocs](https://docs.python.org/3/library/os.html), watch video by [Corey Schafer](https://www.youtube.com/watch?v=tJxcKyFMTGo)
4. [regex](https://pymotw.com/3/re/index.html)  
   Check out [PyDocs](https://docs.python.org/3/library/re.html), watch video by [Corey Schafer](https://www.youtube.com/watch?v=K8L6KVGG-7o)
5. [datetime](https://pymotw.com/3/datetime/index.html)  
   Check out [PyDocs](https://docs.python.org/3/library/datetime.html), watch video by [Socratica](https://www.youtube.com/watch?v=RjMbCUpvIgw)
6. [BeautifulSoup](https://beautiful-soup-4.readthedocs.io/en/latest/#quick-start)  
   Check out video by [freeCodeCamp](https://www.youtube.com/watch?v=XVv6mJpFOb0) , [Corey Schafer](https://www.youtube.com/watch?v=ng2o98k983k), [Keith Galli](https://www.youtube.com/watch?v=GjKQ6V_ViQE)
7. [Requests](https://docs.python-requests.org/en/latest/user/quickstart/)  
   Check out video by [Corey Schafer](https://www.youtube.com/watch?v=tb8gHvYlCFs) 
8. [Pandas](https://pandas.pydata.org/pandas-docs/stable/user_guide/10min.html)  
   Check out video by [Keith Galli](https://www.youtube.com/watch?v=vmEHCJofslg)
9. [Scrapy](https://docs.scrapy.org/en/latest/)  
   Check out video by [Rooney](https://youtu.be/s4jtkzHhLzY)
10. [Tabula](https://tabula-py.readthedocs.io/en/latest/tabula.html)  
   Check out scraping pdfs using tabula: [Video by Journalists toolbox](https://www.youtube.com/watch?v=z896oxmp5Qw)
11. [Chrome webscraper extension](https://chrome.google.com/webstore/detail/web-scraper-free-web-scra/jnhgnonknehpejjnehehllkliplmbmhn)  
   Watch a tutorial [video](https://www.youtube.com/watch?v=aClnnoQK9G0)

A great resource : [Journalist Toolbox](https://journaliststoolbox.org/), See also [OpenSecrets](https://www.opensecrets.org/)

## Module 3: Prepare the data
This section we look at cleaning and transform data using excel and python.

Links:
1. [pdftotext](http://www.xpdfreader.com/pdftotext-man.html)
2. [Openrefine](https://openrefine.org/)
3. [Pandas Profiling](https://youtube.com/playlist?list=PL40bSdpQjo1Bvvya3cGxlpwfZ6r7h6seA) : Check out [video by Data Professor](https://youtu.be/Ef169VELt5o)
4. [Pillow (PIL)](https://pypi.org/project/Pillow/) : Check [documentation](https://pillow.readthedocs.io/en/stable/), [video by Corey Schafer](https://youtu.be/6Qs3wObeWwc), [video by PyMoondra](https://youtu.be/dkp4wUhCwR4)
5. [io module](https://pymotw.com/3/io/): Check [documentation](https://docs.python.org/3/library/io.html), [video](https://youtu.be/cIaOisyd7lE)

We look at image labelling and previewing images directly in excel sheets, using visual basic.  

Other tools to look at:  
[Trifacta (Alteryx)](https://www.trifacta.com/), [Apache Airflow](https://airflow.apache.org/docs/apache-airflow/stable/), [KNIME](https://www.knime.com/)


## Module 4a: Model the data
1. [Playlist](https://youtube.com/playlist?list=PLUaB-1hjhk8Hyd5NiPQ9CND82vNodlFF5) for basic excel tutorials by Alex the Analyst  
2. [Excel playlist](https://youtube.com/playlist?list=PL0o_zxa4K1BWYhjLZRtBWRTghtPGQwEfe) by The Organic Chemistry Tutor  
3. Talk by Anand S on [Visualizing Machine Learning](https://youtu.be/sORnCj52COw)
4. [Statsmodels](https://www.statsmodels.org/stable/index.html) module and [playlist](https://youtube.com/playlist?list=PLlbbWgBRF8EePgK40-i7aGU2_ky1yujgL) by DS4E

## Module 4b: Model the data
1. Imbalanced classification using SMOTE: https://machinelearningmastery.com/smote-oversampling-for-imbalanced-classification/
2. [PyDotPlus](https://pypi.org/project/pydotplus/): For visual representation of graph trees and networks
3. R, Rstudio and [Rattle](https://rattle.togaware.com/) for data mining
4. [PyCaret](https://pycaret.org/) : Low code ML library in python, also see [this guide for PyCaret](https://pycaret.gitbook.io/docs/)
5. [Shap(Shapely additive explanations library)](https://shap.readthedocs.io/en/latest/)
 
## Module 5a: Deep Learning Models

## Module 5b: Deep Learning Models

## Module 6a: Design your output
General tools:
1. Excel forecasts and dashboards
2. Google data studio
3. Power BI
4. Tableau
   
Specialized Tools:
1. [Kumu](https://kumu.io/) is a tool mostly used for visualizing networks.
2. [QGIS](https://qgis.org/en/site/) is for geographic visualizations
3. [Flourish](https://flourish.studio/) for animated charts

## Module 6b: Design your output


## Module 7: Narrate a story





