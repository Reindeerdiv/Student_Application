FROM   openjdk
ADD /target/student-1.0.0.jar /home/studentapplication/student-1.0.0.jar
WORKDIR /home/studentapplication/
CMD ["java","-jar","student-1.0.0.jar"]


	

