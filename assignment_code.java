from wordcloud import WordCloud, STOPWORDS 
import pandas as pd 
import matplotlib.pyplot as plt 
from PIL import Image 
import numpy as np 
 stopwords = set(STOPWORDS) 
 mask = np.array(Image.open(' Nayeemul.png')) 
 data_file = pd.read_csv('Nayeemul.csv') 
 wordcloud = WordCloud( 
   stopwords=stopwords, 
   width=1600, 
   =1200, 
   mask=mask, 
#scale=2, 
background_color="black", 
colormap="Set3" 
).generate(''.join(data_file['text'])) 
background_image = Image.open('Nayeemul.jpg') 
background_array = np.array(background_image) 
plt.figure(figsize=(12, 12)) 
plt.imshow(background_array, interpolation='bilinear') 
plt.imshow(wordcloud, interpolation='bilinear', alpha=0.7) 
plt.axis('off')
