robolectric-upgrade-test
========================
This repo contains a project that I am using to update the way in which I use Robolectric. Previously on Android Studio 0.8.14 and Gradle 1.11 I had been using the Robolectric plugin.  When upgrading to the new code for Gradle 2.2 and Android Studio 1.0, I experienced bugs that I could not resolve.

When I took a look at the [new Robolectric samples](https://github.com/robolectric/robolectric-samples), I saw they are no longer using the Robolectric plugin, but are instead using JC and K Solutions unit test library.  I am now in the process of intergrating this library in this simple sample project, which I can use as a template for further projects.

After integrating the new JC and K library I sadly ended up in the same spot as before, with the NoClassDef exception showing up in my unit tests when I attempt to create an Activity like this:
<br>
`Activity activity = Robolectric.setupActivity(MainActivity.class);`

ERROR:
<br>
`java.lang.ClassCastException: java.lang.NoClassDefFoundError cannot be cast to java.lang.RuntimeException`

I have opened a [Stack Overflow question here](http://stackoverflow.com/questions/27574165/robolectric-2-4-java-lang-classcastexception-java-lang-noclassdeffounderror-ca), and will update this doc with any progress from the community.

