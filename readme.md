# Project Athena

Project Athena is an Android application intented to be used
in refugee camps such as the Za'atari camp in Jordan.

This program is part of the P2 project of Medialogy group 207 at Aalborg University CPH.

It is made in conjuction with a report and research regarding human computer interaction (HCI) 
and the problems facing the Za'atari camp in Jordan regarding education.

The application utilizes a gamified, self-paced m-learning solution, 
which potentially with the right collaborators
could grant the student access to an exam at a recognized learning institution.
The application is implemented in conjuction with a city-building game, which is, 
at this point, implemented as a separate application. 
The same is true for the self-evaluation tests found at the end of each lesson.
The self evaluation tests are in the form of quizes found at: https://www.quiz-maker.com/QFZ9PJEYP 

Both the main application as well as the city builder game is found as an apk in folder: "Project Athena".


##The material
The learning material, while only implemented as placeholder text. When clicked, the text changes color to signify 
that the learning material has been read and finished. At this point, there is not a separate popup for each lesson, 
but a shared one for the entire module, which is only for placeholder purposes.
in the current iteration of the application is split into a hierarchy consisting of:
- Grades
    - Subjects
        - Modules
            - Lessons
                - Materials

The navigation through the hierarchy is however fully implemented and serves as a platform 
on which to host learning materials, provided by professional educators.
This is to say, that Medialogy group 207 do not concern themselves with the learning materials themselves,
as this is best left to professionals in that particular field. 
What the group hopes to accomplish with the application is to provide a platform 
on which to host the material in a way that is fun and engaging as well as manageable for the student.

## placeholder objects
The application at this point has many elements with no functionality.
Known placeholder elements and missing functionality are, and not limited to the following:
- Dashboard screen has no fuctionality.
- Settings page is only placeholder elements with no effect outside of the screen.
- Material fields in each lesson are simply text with no connection to any files.
- points given for each subject are at the moment the same points. There is no way to achieve math points at the moment. Only literacy points are implemented.
- Language- and choose grade- screens have no effect on the information being displayed.
They are only there to simulate the effect of the application once fully implemented.
The text fields in the settings page cannot be edited.
- It is not possible to add new short- and long-term goals other than the fields already on screen.
- City builder game is not implemented in the main application, but as a separate application.
##points, achievements and a sense of progression
Each subject (math and literacy) is associated with one type of points 
which in turn work as "building materials" in the city building aspect of the application.
Buildings in the city are built using these materials and unlocked 
through achievements through the student's progression in the curriculum.

Regarding the interface the student's progression is communicated
through pie charts associated with each module and subsequent lessons.
Application-wide colors signifying "to do" and "finished" 
are applied to these according to the students progression. 