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

Check out the project using Android Studio. This creates the `local.properties` file
with the required line

    sdk.dir=<root folder of Android Studio's Android SDK installation>

# Running the Application

In Android Studio: `Run > Run app`

# Running the Tests

## Unit tests

In Android Studio:

* `View > Tool Windows > Build Variants`
* `Test Artifact: Unit Tests`
* right-click on `app/java/edu...shapes (test)`, then choose `Run Tests in edu...`

You can also use Gradle:

    $ ./gradlew testDebug

You can view the resulting test reports in HTML by opening this file in your browser:

    app/build/reports/tests/debug/index.html

(So far, this example does not include any Android instrumentation tests.)
