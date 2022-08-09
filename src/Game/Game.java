package Game;

public class Game{
    private String description;
    Game( String newDescription )
    {
        setDescription( newDescription ) ;
    }
    public String getDescription( )
    {
        return description;
    }
    public void setDescription( String newDescription )
    { description = newDescription;
    }
    public String toString( )
    {
        return ( " d e s c r i p t i o n: " + description ) ;
    }
}