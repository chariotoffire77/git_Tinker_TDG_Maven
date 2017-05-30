1. Copy mvntinker to ~/mvntinker

2. simple-parent/simple-webapp
   When you run the application, run it as:

   mvn -Djetty.port=8085 jetty:run 2>&1|tee out.jetty.run.8085
   if you use default port 8080,
   you may address still in use errors.

   Note that you can test the url using the curl scripts

3. to stop jetty, do CTRL-C in the window where jetty:run was 
   executed.

4. Note the in simple-parent/simple-weather, that the
   application is using the test data that is hardcoded
   just to get the example working.

 
