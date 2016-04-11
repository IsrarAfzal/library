import com.library.*

class BootStrap {

    def init = { servletContext ->
def course1= new Course(title:'Computer Science',
			code:'CSE299',
			tutor:'Andrea Carson',
			department:'Computing',
			description:'''Learn how to develop complex software and systems using analytical and mathematical approaches. This course is ideal if you want to become a programmer who understands and can build on the fundamental principles behind the software that powers our world.''').save()

def course2= new Course(title:'Games Development',
			code:'MEG344',
			tutor:'Harold Finch',
			department:'Computing',
			description:'''There are two distinct types of careers in games development – the technical programming side, and the creative art and design side. This course prepares you for the first type of career, giving you all the skills you need to work as a software developer in the competitive games industry.''').save()

def student1= new Student(name:'Abigail Anthony',
			email:'b4035621@my.shu.ac.uk',
			studentId:'b4035621',
			course:'Games Development').save()

def student2= new Student(name:'Amber Masud',
			email:'b4001506@my.shu.ac.uk',
			studentId:'b4001506',
			course:'Engineering').save()
    }
    def destroy = {
    }
}
