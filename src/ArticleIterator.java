import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ArticleIterator implements Iterator {
    private int index;
    private List<ArticleComponent> articleComponents = new ArrayList<>();

    public ArticleIterator(List<ArticleComponent> components){
        this.index = 0;
        this.articleComponents = components;
    }

    public boolean hasNext(){
        if (index < this.articleComponents.size()){
            return true;
        }
        return false;
    }

    public ArticleComponent next(){
        ArticleComponent component = this.articleComponents.get(index);
        index += 1;
        return component;
    }
    
}
