https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap

https://stackoverflow.com/questions/12940663/does-adding-a-duplicate-value-to-a-hashset-hashmap-replace-the-previous-value

****HashMap vs HashSet:

The map holds unique keys. When you invoke put with a key that exists in the map, the object under that key is replaced with the new object. Hence the size 1.

The difference between the two should be obvious:
#
--in a Map you store key-value pairs.
--in a Set you store only the keys.
#
In fact, a HashSet has a HashMap field, and whenever add(obj) is invoked, the put method is invoked on the underlying map map.put(obj, DUMMY) - where the dummy object is a private static final Object DUMMY = new Object(). So the map is populated with your object as key, and a value that is of no interest.
