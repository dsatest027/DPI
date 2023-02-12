# Drug Prices Information
This application displays a list of prices and pharmacies for a given searched drug, additionally the
user can set its location to more accurately display the pharmacies and its found drug prices
nearby.

# By
David Alderson
240-485-8136
dsa027@gmail.com

# For
GoodRX Sr Engineer interview project

# Notes
- I was able to get the data from the endpoint using a browser. However, endpoint isn't lettimg the app have the data and gives me a 403. Is there an API Key or other method needed for this?
- I pretty easily spent 5 hours on this app. About 3 hours on UI and 2 hours on setup & dependencies and troubleshooting the 403 coming back from ktor. I ended up having to mock the data coming from the endpoint. So no matter what you put into search, only `amoxicillin` will show.
- I fit in a couple compose tests but did not get a good amount of coverage.

_Your Focus Areas._ What area(s) did you focus on when working on the project? The architecture and data flow? The UI? Something else? Please note what you think best exhibits your skills and areas of expertise.
- I concentrated on both the network layer (ktor) and the UI (compose).
- Areas of expertise:
  - I've gotten reasonably good at compose and I think this app does fairly well at showing that expertise.
  - I think that the project also shows that I have a good grasp of Android all-around. Obviously it's not possible to be an expert in everything Android, but I feel as though I have a certain level of expertise in delivering quality Android apps.

_Copied-in code or copied-in dependencies._ We’re obviously looking to evaluate your skills as an engineer! As such, please tell us which code you’ve copied into your project so we can distinguish between code written for this project, versus code written at another time, or by others (if you’re just referencing a dependency via a dependency manager, no need to call it out here).
- Dependencies - nearly all dependencies were copied in from the following locations:
  - https://www.section.io/engineering-education/making-http-requests-with-ktor-in-android/
  - https://developer.android.com/jetpack/compose/setup
  - Android Developer
- Code
  - `ApiService` and `ApiServiceImpl` are mostly not my code
  - https://www.section.io/engineering-education/making-http-requests-with-ktor-in-android/

_Tablet / phone focus._ If you focus on one or the other, please let us know which one.
I developed and tested on phone and didn't really address any form-factor issues.
