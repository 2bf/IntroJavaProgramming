# Final Project Paper

Chiming Wang
Ms. Zinn (Period 8)
Intro to Java & Programming
Final Project Paper

Reaction time is a valuable metric designed to measure the brain and body’s ability to
react to external stimuli quickly. Reaction time data is extremely useful in athletic training
because it can be used to measure an athlete’s reflexes, coordination, and performance. Reaction
time can also be used in the medical field and provide insights into a person’s cognitive and
motor functions. For my final project, I wanted to create a program that measures reaction time
using Java’s Timer class, which we have not covered in class. In the program, users must click a
button as quickly as possible when a visual stimulus appears on the screen (when the Panel turns
green).
To embark on this project, I started conducting thorough research on Java Timers. During
the research phase, I found out that Timers were actually used to “schedule tasks for future
execution” (Oracle), rather than to time events like I initially thought. However, I could still use
this to my advantage — I realized I could implement Timers in a way that schedules the display
of visual stimuli to the user. Without the Timer class, I wouldn’t have been able to use a specific
number of seconds to schedule the event of the panel turning green and the program would’ve
been much different. It would have been a fixed duration before the panel turned green, meaning
the player could potentially predict the stimulus and cheat the program.

However, although I found a way to use the Timer class, I still had to find a way to record
the reaction time by measuring the number of milliseconds between the event of the visual
stimuli and the event of the user pressing the button. After more research, I found that the
currentTimeMillis method could be used as a reliable way to measure time in milliseconds. I
used currentTimeMillis to record the system time when the stimulus was displayed and again
when the user clicked the button. I then calculated the difference between these two values as an
accurate measurement of the user’s reaction time.
To design and develop the program, I initially wrote a list of events that would happen in
the program. First, when the program is run, a JPanel with text instructions and a small button
would appear. The user would read the instructions and press the button. After 3-6 seconds, the
panel would turn green, and the program would record currentTimeMillis and store it in a
variable. After this, the user would need to press the button as quickly as possible, and when this
happens, the program records currentTimeMillis and stores it in another variable. The difference
between the two variables is calculated, and this gives the final reaction time of the user, which is
then printed out on the JPanel. Then the program would revert back to its original default color
and run again. Timers were used to schedule the event of the panel turning green after a few
seconds, and currentTimeMillis was used to record the user’s reaction time.

Works Cited

"Class System, currentTimeMillis." Oracle Java Documentation, Oracle,
docs.oracle.com/javase/8/docs/api/java/lang/System.html#currentTimeMillis--. Accessed
7 June 2023.
"Class Timer." Oracle Java Documentation, Oracle,
docs.oracle.com/javase/8/docs/api/java/util/Timer.html. Accessed 7 June 2023.
