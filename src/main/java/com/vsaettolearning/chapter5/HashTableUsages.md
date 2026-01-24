# Hash Table usages

## Modeling relationships from one thing to the other

```pyhon
>>> phone_book = dict()

>>> phone_book[“jenny”] = 8675309
>>> phone_book[“emergency”] = 911

>>> print phone_book[“jenny”]
8675309
```

## Filtering out duplicates

```pyhon
voted = {}

def check_voter(name):
    if voted.get(name):
        print “kick them out!”
    else:
        voted[name] = True
        print “let them vote!”
        
>>> check_voter(“tom”)
let them vote!
>>> check_voter(“mike”)
let them vote!
>>> check_voter(“mike”)
kick them out!
```

## Catching/memorizing

```pyhon
def get_page(url):
    if cache.get(url):
        return cache[url] // Returns cached data
    else:
        data = get_data_from_server(url)
        cache[url] = data Saves this data in your cache first
        return data
```

