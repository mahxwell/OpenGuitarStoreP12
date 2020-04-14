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

Coming Soon.....

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

#### Frontend deployment 

Frontend is made with Angular, you will need node.js and npm to make it work correctly

Install npm and node.js : https://www.npmjs.com/get-npm

Install Frontend dependecies : 

`- OpenGuitarStoreP12-master\Install\Windows\ClientUI\01_InstallNodes.bat`

Lauch ClientUI Server :

`- OpenGuitarStoreP12-master\Install\Windows\ClientUI\02_LaunchClienUIServer.bat`

#### Batch Processing deployment 

As told in previously in Features section, a reservation and a newsletters system are implemented 

Run Batch : 

`- OpenGuitarStoreP12-master\Install\Windows\Batch\BatchLauncher.bat`

Stop Batch : 

`- OpenGuitarStoreP12-master\Install\Windows\Batch\StopBatch.bat`

### MacOS DEPLOYMENT

Coming soon ....

### Run It On Your Browser !

To run and test application please go to your brower : http://localhost:4200/

Please use Google Chrome for a better experience ! 

### Testing And Build

Integration Tests were made with Travis CI 

You can click on [![Build Status](https://travis-ci.org/mahxwell/OpenGuitarStoreP12.svg?branch=master)](https://travis-ci.org/mahxwell/OpenGuitarStoreP12)  to see more build details...
