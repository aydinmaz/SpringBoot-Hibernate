package it.finsoft.one_to_many.controller;




/*import java.util.ArrayList;
import java.util.Collection;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.finsoft.one_to_many.model.Book;
import it.finsoft.one_to_many.model.Bookdetail;
import it.finsoft.one_to_many.repository.BookRepository;
import it.finsoft.one_to_many.repository.BookdetailRepository;

@RestController
@RequestMapping("/rest")
public class BookController {

	
	@Autowired
	 BookRepository bookrepo;
	
	@Autowired
	 BookdetailRepository bookdetailrepo;
	
	@GetMapping("/book")
	public Iterable<Book> qualcosa()
	{
//		Collection<Bookdetail> bkdetaillist=new ArrayList<>();
		Book bk1 = new Book();
		bk1.setName("gian");
		
		Book bk2 = new Book();
		bk2.setName("lucia");
		
		Bookdetail bkdt1=new Bookdetail("detail1", "haminjuri");
		Bookdetail bkdt2=new Bookdetail("detail2", "delet bekhad");
		Bookdetail bkdt3=new Bookdetail("detail3", "khube");
		Bookdetail bkdt4=new Bookdetail("detail4", "bashe");
		
/*		bkdetaillist.add(bkdt1);
		bkdetaillist.add(bkdt2);
		bkdetaillist.add(bkdt3);
		bkdetaillist.add(bkdt4);*/
		bkdt1.setBook(bk1);
		bkdt2.setBook(bk1);
		bkdt3.setBook(bk2);
		bkdt4.setBook(bk2);
		//tartrib mohemme, baayd avval book ha dar msql save beshe baad bookdetail vagarna error5 mide
		//mituni doone doone ketaabha ro to msql save koni ya hame ro bezari tu ye list baad list ro tu msql save koni
		bookrepo.save(bk1);
		bookrepo.save(bk2);
		bookdetailrepo.save(bkdt1);
		bookdetailrepo.save(bkdt2);
		bookdetailrepo.save(bkdt3);
		bookdetailrepo.save(bkdt4);
		//bookdetailrepo.save(bkdetaillist);
		return bookrepo.findAll();
	}
	
}
