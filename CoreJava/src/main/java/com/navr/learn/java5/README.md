# Java 5 Features

## Generics

### WildCard
| Wildcard Type | Adding Elements | Reading Elements | Use Case | 
|-----:|---------------|-----|---------------|
| List<?> | Not allowed (except null) | Read as Object | Read-only for unknown types |
| List<? extends T> | Not allowed (except null) | Read as T | Read-only for subtypes of T |
| List<? super T> | Can add T and subtypes | Read as Object | Write data of type T or its subtypes |


