#!/bin/bash
#moduleName=$1
scalaVersion="2.11"
version="2.0.3"
for moduleName in `cat spark-module-list.txt`
   do
      if [ -z $moduleName ] 
      then
         echo" No module provided"
      else
         echo "Module name : "$moduleName
         mvn deploy:deploy-file -Dfile=./assembly/target/scala-"$scalaVersion"/jars/"$moduleName"_"$scalaVersion"-"$version"-SNAPSHOT.jar -DrepositoryId=snapshots -Durl=https://artifactory.eng.toasttab.com/artifactory/libs-snapshot-local -DgroupId=org.apache.spark -DartifactId="$moduleName"_"$scalaVersion" -Dversion=$version-SNAPSHOT
        if [ $? -ne 0 ]
	then
	   echo "Failed to deploy module : "$moduleName
	   break
	fi
   fi
done;
