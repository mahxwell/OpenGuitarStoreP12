[![Build Status](https://travis-ci.org/mahxwell/OpenGuitarStoreP12.svg?branch=master)](https://travis-ci.org/mahxwell/OpenGuitarStoreP12) [![CodeFactor](https://www.codefactor.io/repository/github/mahxwell/openguitarstorep12/badge)](https://www.codefactor.io/repository/github/mahxwell/openguitarstorep12)

# OPENGUITARSTORE

This Project was created with :

Languages : 
  - Backend : `- Java 1.8`
  - Frontend :`- Angular 8`
  

Frameworks :

`- SpringBoot 2.0`

`- SpringCloud`

`- SpringAdmin 5.0`

`- Apache Maven`

Server :

`- Eureka Server`

`- Zuul Server`

Database :

`- Postgre SQL(10.x)`


Docker was also used for Applications deployment.

For more informations, please follow "Get started" point bellow

## Features


_Welcome to the best Guitar Store online !_


* Join the website and ROCK ON !  
`- You can register as member of this website to access all features. Also Update, delete your profile anytime.`

* Keep in touch with us !  
`- Become a member to receive weekly newsletter with best deals !`

* Buy your favourite Guitar !  
`- Get your new instrument in only 3 days !`

* Waiting for your wished Guitar  
`- Some of OpenGuitarStore instrument are not commun, that's why you can reservate a guitar not available yet`

* Rate and review anytime your instrument  
`-  Give us your feedback on instrument, share it with rock community !`


_Greetings From OpenGuitarStore team !_


## Get Started

### WINDOWS DEPLOYMENT

First of all, run Docker Desktop on your computer.

All Docker scripts are made as `.bat` files, please just double click on it to run

##### Please follow this specific order to deploy application and Wait 30 seconds between all steps !!

#### Backend deployment 

Run Database :

`- OpenGuitarStoreP12-master\Install\Windows\Servers\01_composedb.bat`

Run Eureka server :

`- OpenGuitarStoreP12-master\Install\Windows\Servers\02_composeEureka.bat`

Run ALL MicroServices :

`- OpenGuitarStoreP12-master\Install\Windows\Servers\03_composeMicroServices.bat`

Run Zuul Server : 

`- OpenGuitarStoreP12-master\Install\Windows\Servers\04_composeZuul.bat`

You can stop and remove all Servers\ container by running :

`- OpenGuitarStoreP12-master\Install\Windows\Servers\Purge\Purge.bat`

For some troubles with Docker performance, running springcloud and springadmin containers are not recommanded.
Yet docker scripts for both of them are in : `- OpenGuitarStoreP12-master\Install\Windows\Servers\Option\*`

#### Frontend deployment 

Frontend is made with Angular, you will need node.js and npm to make it work correctly

Install npm and node.js : https://www.npmjs.com/get-npm

Install Frontend dependecies : 

`- OpenGuitarStoreP12-master\Install\Windows\ClientUI\01_InstallNodes.bat`

Lauch ClientUI Server :

`- OpenGuitarStoreP12-master\Install\Windows\ClientUI\02_LaunchClienUIServer.bat`

For some troubles with Docker performance, running clientui container is not recommanded.
Yet docker script are in : `- OpenGuitarStoreP12-master\Install\Windows\ClientUI\`
Please just unzip `container.zip` archive and then launch `- composeClient.bat`


#### Batch Processing deployment 

As told in previously in Features section, a reservation and a newsletters system are implemented 

Run Batch : 

`- OpenGuitarStoreP12-master\Install\Windows\Batch\BatchLauncher.bat`

Stop Batch : 

`- OpenGuitarStoreP12-master\Install\Windows\Batch\StopBatch.bat`

### LINUX DEPLOYMENT(Only Tested on Ubuntu)

First of all run Docker Desktop on your computer. 
As Unix systems, all running scripts are `.sh` files.
Please run this following commands in THIS order in your terminal (bash) :

#### Backend deployment 

Run all servers :

`- bash OpenGuitarStoreP12/Install/Linux/composeServers.sh`

#### Frontend deployment 

Frontend is made with Angular, you will need node.js and npm to make it work correctly

Install npm and node.js : https://www.npmjs.com/get-npm

Lauch ClientUI Server :

`- bash OpenGuitarStoreP12/Install/Linux/ClientUI/composeClientUI.sh`

#### Batch Processing deployment 

As told in previously in Features section, a reservation and a newsletters system are implemented 

Run Batch : 

`- bash OpenGuitarStoreP12/Install/Linux/Batch/composeBatch.sh`

### MACOS DEPLOYMENT

MacOS deployement is the same as Linux one.
Follow the same steps just bellow (Linux Deployment) to make it work correctly.
Go to `MacOS` folder instead of `Linux` one.

## Run It On Your Browser !

To run and test application please enter in your broswer : http://localhost:4200/

Please use Google Chrome for a better experience ! 

## Testing And Build

Integration Tests were made with Travis CI 

You can click on [![Build Status](https://travis-ci.org/mahxwell/OpenGuitarStoreP12.svg?branch=master)](https://travis-ci.org/mahxwell/OpenGuitarStoreP12)  to see more build details...
