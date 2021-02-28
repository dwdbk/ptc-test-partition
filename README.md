# ptc-test-partition
SUJET MAISON TEST JAVA 1 - Écrivez une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments. Exemples d'entrées et sorties :     partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ] partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ] partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]     2 - Écrivez des tests unitaires avec Junit4 pour vérifier votre implémentation.  Important : Partez du principe que votre implémentation fera partie d'une librairie utilisé par plein d'autres applications (en production) Livraison attendu : une archive contenant les sources du projet, et les instructions pour les utiliser.


#Solution :

## Build the project :
`./gradlew clean build`

## Adding API documentation to the project :
`./gradlew javadoc`

## Publish a Build Scan the project :
`./gradlew build --scan`

## Build only library :
`cd partitionLibrary`

`gradle clean build`

## Use library in a project :

### Method 1
Include the library into your setting.gradle file project :

`include('partitionLibrary')`

Add the dependency to your project gradle :

#### Method 1

`implementation project(":partitionLibrary")`

#### Method 2
Add the library `.jar` in the `libs` folder

`implementation fileTree(dir: 'libs', include: ['*.jar'])`

## Build only demo :
`cd demo`

`gradle clean build`

## Example to use the library in your code

Import : 

`import com.partition.PartitionLibrary;`

Code :

`List<Integer> initlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));`

`List<List<Integer>> subSets = PartitionLibrary.partition(initlist, 3);`

Output : 

subSets => `[[1,2,3],[4,5,6],[7,8]]`