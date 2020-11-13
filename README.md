# Kama_Gallery


A Project to show implementation of gallery for android with endless feed, written in kotlin using MVP Structure.





# Project requirements:
* Link to a repository 
1) your code :white_check_mark:
2) apk in releases :white_check_mark:
3) name and short description :white_check_mark:
4) screenshots in readme.md :white_check_mark:
* Use of data storage (SharedPreferences, sqlite, room) :white_check_mark:
* RecycleView or Cardview with custom layout and code :white_check_mark:
* At least one activity should be written on Kotlin :white_check_mark:
* Misc  
1) Application icon changed :white_check_mark:
2) Animation and design (figma or other) :white_check_mark:  [Figma](https://www.figma.com/file/qlXvSOUFTBA0HocXwxB1ok/Kama_Gallery)






![home](https://user-images.githubusercontent.com/45779903/99031425-3db27500-25a1-11eb-9cb6-a4167f04581d.jpg)

### This project uses:
* **RxJava 2** - For Reactive Programming
* **Dagger 2** - For Dependency Injection
* **Retrofit 2** - As Type Safe HTTP client
* **Room** - For persistence storage(abstraction of SQLite)

### MVP Architecture Blueprint
![Architecture](https://raw.githubusercontent.com/gauravk95/mvp-android-template/master/MVPArchBlueprint.jpg)

### The app has following packages:
1. **base:** It contains base classes
2. **data:** It contains all the data accessing and manipulating components like data models, sources, repositories
    * model
      * local
      * remote
    * source
      * db
      * network
      * prefs
      * repository
         * local
         * remote
3. **di:** Dependency providing classes using Dagger2.
    * component
    * module
4. **ui:** View classes along with their corresponding Presenters.
    * custom
    * adapters
    * main
5. **service:** Services for the application.
6. **utils:** Utility classes.
    * fonts 
    * rx 
    

