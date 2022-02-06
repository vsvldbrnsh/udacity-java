#Two projects:

  - Guess The Movie game:
    - code that simply read the movie list from file (movies.txt) line by line.
    - then code randomly pick one movie title.
    - then movie title need to be converted with its letters to underscores (_) and display that instead, for instance (_ _ _ _ _   _ _ _   _ _ _ _ ).
    - start reading user's input and search for it in the title.
    - work on revealing the correct letters and displaying them (s _ w _ t   _ _ _   _ _ _ e ). 
    - after that, code have to keep track of how many wrong guesses and end the game if they lose (10 wrong guesses).
    - finally, detect when user has guessed all the letters and let user know he has won!
    
  - Space-challenge (this is a project for Udacity OOP class):
    - The mission is to send a list of items (Habitats, bunkers, food supplies, and rovers) 
    to Mars, but we need to run some simulations first to pick the correct fleet of rockets.
    We've already designed 2 rocket prototypes, but we need your help to design and run some simulations to help us decide which type to use.
    - U-1
      The U-1 Rocket is light weight, agile and pretty safe, but can only carry a total of 18 tonnes of cargo.
      It costs $60 Million to build and weighs 10 tonnes. 
      It has a slim chance of crashing while landing but a bigger chance of exploding when launching, 
      both chances depend on the amount of cargo carried in the rocket.
      Rocket Specifications
      Rocket cost = $100 Million
      Rocket weight = 10 Tonnes
      Max weight (with cargo) = 18 Tonnes
      Chance of launch explosion = 5% * (cargo carried / cargo limit)
      Chance of landing crash = 1% * (cargo carried / cargo limit)
   - U-2
      The U2 Rocket heavier than the U-1 but much safer and can carry a lot more cargo; to a total of 29 tonnes. However, it costs $120 Million to build and weighs 20 tonnes. It has a greater chance of crashing while landing than while launching, but just like the U-1 both chances depend on the amount of cargo carried. Rocket Specifications
      Rocket cost = $120 Million
      Rocket weight = 18 Tonnes
      Max weight (with cargo) = 29 Tonnes
      Chance of launch explosion = 4% * (cargo carried / cargo limit)
      Chance of landing crash = 8% * (cargo carried / cargo limit)
  - The mission consists of 2 phases:
    Phase-1:
    This phase is meant to send building equipment and construction material to help build the colony. 
    In the resources tab, you will find a text file that contains the list of all items that we need to send called 'Phase-1.txt'. 
    Each line in the file also contains the item name and its Each line in the file contains the item name as well as its weight in Kgs.
    Phase-2:
    This phase is meant to send the colony of humans along with some food resources. 
    Each line in the file also contains the item name and its Each line in the file contains the item name as well as its weight in Kgs.
    Your job is to run some simulations and test both rocket types for each phase separately.
