robolectric-upgrade-test
========================
This repo contains a project that I am using to update the way in which I use Robolectric. Previously on Android Studio 0.8.14 and Gradle 1.11 I had been using the Robolectric plugin.  When upgrading to the new code for Gradle 2.2 and Android Studio 1.0, I experienced bugs that I could not resolve.

When I took a look at the [new Robolectric samples](https://github.com/robolectric/robolectric-samples), I saw they are no longer using the Robolectric plugin, but are instead using JC and K Solutions unit test library.  I am now in the process of intergrating this library in this simple sample project, which I can use as a template for further projects.

