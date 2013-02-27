# Learning Objectives

* Familiarity with a simple graphical (output-only) Android project
* Basic design patterns and their purpose
    * Composite pattern
    * Decorator pattern
    * Visitor pattern

# Reading/Listening

* SE Radio episode 1
* APPP chapters 31 and 35

# Setting up the Environment

* Set up Android 4.2 as an Eclipse user library `Android 4.2` with the external jars
    * `sdk.dir/platforms/android-17/android.jar`
    * `sdk.dir/add-ons/addon-google_apis-google-17/libs/maps.jar`
* Download [mockito-all-x.x.x.jar](http://code.google.com/p/mockito/downloads/list "download jar") (jar with all dependencies) and set it up as an Eclipse user library `Mockito 1.9.5`

# Running the Application

* Android: as usual through Eclipse

# Running the Tests

* Test with JUnit: in the main project, right-click on `test` > Run As... > JUnit Test
  (if prompted for configuration-specific options, choose the Android JUnit test runner)
