Name | Action | Expected result | Actual result
— | — | — | —
1-1 opening of main page | open main page using link | main page is opened (all web-items is it their places) | Passed
2-1 opening of previous/next page user wants using page buttons | open page using previous/next number | all pages are opened | Passed
3-1 opening of full page any of news | open full page of news | full page of any news is opened (all web-items is it their places) | Passed
4-1 succesful authorization using correct identification data | authorisate using correct and incorrect login and password | succesful authorization using correct identification data, failed authorization using incorrect identification data | Passed
4-3 displaying of identification data | sign in, check identification data | correctly displayed identification data (name of user and login) after authorization, identification data is not displayed if user is not authorizated | Passed
5-1 succesful loging out after pushing log out button | push log out button (is enable when user is authorized) | user has been logged out | Passed
5-2 correctly displayed pages after loging out (with no signs of user) | log in, log out, try to find in web-pages signs of user | there is no signs of user on all pages | Passed
6-1 correctly displayed adding news page | open adding news page, check availability of title text field, description and body text areas | all data is correct, all objects are on their place | Passed
6-2 adding news with title, description and text (allows html-insertions) | try to add news: write something in fields on adding news page and push add news button | news is appeared on main page | Passed
6-3 correctly displayed page after its adding (title, description, text, date, author) | add news and check all data of this news (title, description, text, date, author) | all data is valid | Passed
6-4 inability to add news without authorization | try to add news using page request ".../add_news" | access denied page appeared | Passed
7-1 correctly displayed delete buttons after authorisation | sign in, check delete buttons | buttons are on their places |
7-2 deleting news | try to delete some news, make request with this ".../news/{news-num}" | news has been dissapeared from pages and is not available from ".../news/{news-num}" request | Passed
7-3 inability to add news without authorization | try to delete some news using page request ".../delete/{news-id}"" | access denied page appeared | Passed
7-4 displaying of news list without news that has been deleted | add some news, find them on pages, delete them, check news pages | there is no deleted news on pages | Passed
8-1 pefrorm in all web-browsers | open and check functionality in Google Chrome, Safari, Mozilla Firefox, Microsoft Edge, Opera | all functionality of site works well using any web-browser | Not passed. Web-app doesn't behave well in Safari browser. Some buttons (such as "Go back") doesn't work
