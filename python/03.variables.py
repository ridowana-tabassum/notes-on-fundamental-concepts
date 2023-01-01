# Variables are containers that store information that can be manipulated and referenced later by the programmer within the code.

#python variables 
name = "Denji" #type str
age= 18        #typen int 
passed= True   #type bool

#few valid variables e.g 
Language = "C"
lAnguage = "JAVA"
_language = "JS"
language = "C#"
nameOftheLangauage = "python"

#scope of variable
iceCream = "chocolate"     #gobal variable    
def anime():
    anime_name="Chainsaw man " #local variable
    totalEpisode= "1"          #local variable
    print(anime_name + "is now ongoing. Total episode will be "+ totalEpisode)
anime()

#discussing gobal variable:
iceCream_one = "chocolate"     #gobal variable    
def anime():
    anime_name_one="Chainsaw man "  #local variable
    totalEpisode_one= "12"          #local variable
    print(anime_name_one + "is now ongoing. Total episode will be "+ totalEpisode_one+ ".")
anime()

print("I'm not a fan of "+ iceCream_one)
# print("These days i'm really enjoying") + anime_name_one)  
# this line will not print as it is called a local variable !!

