## Edit Distance Maven Package

- Youtube reference to publish maven packages on github - https://www.youtube.com/watch?v=shUOfbbR3OI

A sample maven package published on github to calculate the edit distance between two strings. 

Please also add the xml block below in your pom.xml file to use the package.

```xml
 <repositories>
   <repository>
     <id>github</id>
     <url>https://maven.pkg.github.com/kartik1998</url>
     <snapshots>
       <enabled>true</enabled>
     </snapshots>
   </repository>
 </repositories>
```
