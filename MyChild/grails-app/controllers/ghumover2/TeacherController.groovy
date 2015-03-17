package ghumover2
import grails.plugin.springsecurity.annotation.Secured


@Secured(['ROLE_TEACHER'])
class TeacherController  {

    def index(){

       render "This is index action of Teacher. Only Teacher can see    this"
    }

    @Secured(['ROLE_TEACHER'])
    def getTeacher(){

        render "getTeacher which is visible to Teacher only"
    }


}
