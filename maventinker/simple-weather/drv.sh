#### BUILD THE CODE???????
#### and install it in our local repository
mvn install 2>&1|tee out.install

##### RUN THE CODE.....
mvn exec:java -Dexec.mainClass=org.sonatype.mavenbook.ch04.weather.Main 2>&1|tee out.exec


