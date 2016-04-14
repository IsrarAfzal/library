import  com.library.*

class BootStrap {

    def init = { servletContext ->
def course1=new Course(title:'Computer Science',
			code:'CSE299',
			tutor:'Andrea Carson',
			department:'Computing',
			description:'''Learn how to develop complex software systems using analytical, mathematical approaches.''').save()

def course2=new Course(title:'Games Development',
			code:'MEG344',
			tutor:'Harold Finch',
			department:'Computing',
			description:'''There are two distinct types of careers available games development the technical programming side, the creative art, design side.''').save()

def course3=new Course(title:'Engineering',
			code:'CSE299',
			tutor:'Andrea Carson',
			department:'Computing',
			description:'''Learn how to solve complex computer issues that people have and to build a PC from the bottom to the top, through the use of the different gates that are still in use today and also learn to code, starting from the beginning to the very highest of levels.''').save()

def student1=new Student(name:'Abigail Anthony',
			email:'b4035621@my.shu.ac.uk',
			studentid:'b4035621',
			course:'Games Development').save()

def student2=new Student(name:'Amber Masud',
			email:'b4001506@my.shu.ac.uk',
			studentid:'b4001506',
			course:'Engineering').save()

def student3=new Student(name:'Alex Price',
email:'b4234627@my.shu.ac.uk',
studentid:'b4234627',
course:'Network Management').save()

def book1=new Book(title:'Northern Lights',
author:'Robert Pullman',
isbn:'98642',
dateBorrowed:'19/10/2015',
dateReturned:'29/10/2015',
student:'Jane Eyre').save()

def book2=new Book(title:'Stormbreaker',
author:'Anthony Horrowitz',
isbn:'34291',
dateBorrowed:'01/02/2016',
dateReturned:'15/02/2016',
student:'Sherrilyn Kenyon').save()

def book3=new Book(title:'Harry Potter and The Order of the Pheonix',
author:'J.K Rowling',
isbn:'75311',
dateBorrowed:'23/12/2015',
dateReturned:'14/01/2016',
student:'Katniss Everdeen').save()

def library1=new Library(location:'Green Block',
openingHours:'08:30',
book:'The Ghost in the Machines',
student:'Alfred Lanning',
librarian:'Jake Gyllenhall').save()

def library2=new Library(location:'Adsetts Building',
openingHours:'04:00',
book:'To Kill a Mockingbird',
student:'Michael Grant',
librarian:'Eion Colfer').save()

def library3=new Library(location:'Princess Diana Road',
openingHours:'09:00',
book:'The Return of The King',
student:'Uzair Shareef',
librarian:'Yvonne Hirst').save()

def librarian1=new Librarian(name:'Yvonne Hirst',
email:'yhirst@dianalibrary.co.uk',
username:'yhirst87',
password:'Steven Hirst',
telephone:'01924 456735').save()

def librarian2=new Librarian(name:'Eion Colfer',
email:'Eion_C@adsetts.shu.ac.uk',
username:'EionC',
password:'EC1olfer',
telephone:'0118 234 7612').save()

def librarian3=new Librarian(name:'Jake Gyllenhall',
email:'Jake_Gyl@gmail.co.uk',
username:'JGyllenhall',
password:'MaggsHall',
telephone:'0121 765 2911').save()
    }
    def destroy = {
    }
}
