this is a little awkward, but in this folder are roughly 192 html pages.
they in large part duplicates of index.html, but represent different months and classifications

here is a quick, slightly edited excerpt of my (Michael) 7/22/2020 log that explains why.

/*

12 months in a year
39 different classifications for crime (in dataset)
50 highest likelihood points plotted
12*39=468 separate pages
12*39*50 = 23400 separate points

the big issue at hand is the 468 separate pages I have to generate, which I very much don't want to have to do
current solution: get rid of some of the classifications
    there's a good reason to do this, many of the classifications are largely irrelevant to our purpose

...

removed 23 classifications, including things like suicide, pornography, bribery, bad checks
16 classifications remaining

12*16=192 pages
12*16*50=9600 separate points
192 is still a lot, but much more manageable

*/

for more details, read the full M3.txt file in public/MichaelLogFolder or load M3.html in your browser

another reason there are 192 html files: original plan with Firebase Realtime DB didn't go as planned
all data will now be physically listed within the script

these pages were not generated manually, but with a java process for the sake of my own sanity