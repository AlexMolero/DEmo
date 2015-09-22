package demo.Service;

import demo.Model.Project;
import demo.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Alex on 22/09/2015.
 */
@Service
@Transactional
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void testProject(){
        Project project=new Project();
        project.setDescription("Mi Proyecto");

        projectRepository.save(project);
        Project project2 = projectRepository.findOne(project.getId());

        System.out.println(project2);


    }
}
