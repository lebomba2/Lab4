package us.mattgreen.comics.model;

import us.mattgreen.comics.model.ComicBook;

import java.util.*;

/**
 * This class is an abstraction of a real beer expert that can make
 * recommendations about beer products based on a color preference.
 * 
 * @author  Textbook, with modifications by Jim Lombardo
 * @version 1.02
 */
public class ComicExpert {
    
    /**
     * Retrieves the beer recommendations.
     * 
     * @param color - the color preference for beer. NOTE: the color is
     * is validated in any way and a String is required.
     * @return a collection of beer products that are appropriate
     * for the preferred beer color
     */

    private ArrayList<ComicBook> comicCollection = new ArrayList<>();

    public ComicExpert() {
        comicCollection.add(new ComicBook("Incredible Hulk #181",8000.00,"First Apperance of Wolverine"));
        comicCollection.add(new ComicBook("Peter Porker the Spectacular Spider-Ham #1",40.00,"Third app of Spider-Ham"));
        comicCollection.add(new ComicBook("Fantastic Four #1",45000.00,"First silver age Marvel Comic and 1st app of the F. F. "));
        comicCollection.add(new ComicBook("Invincible Iron Man #55",8000.00,"1st app. of Thanos"));
        comicCollection.add(new ComicBook("Uncanny X-Men #266",100.00,"1st app. of Gambit"));
        comicCollection.add(new ComicBook("Amazing Spider-Man #101",200.00,"1st app of Morbius the Living Vampire"));
        comicCollection.add(new ComicBook("Amazing Fantasy #15",100000.00,"1st app of Spider-Man"));
    }

    public List getBooks() {

        return comicCollection;
    }
}
