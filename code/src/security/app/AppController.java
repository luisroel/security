/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.app;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import security.entities.Module;
import security.entities.User;
import security.entities.UserRight;
import security.module.ModuleModel;
import security.about.AboutView;
import security.app.AppView;
import security.menu.MenuView;
import security.module.ModuleView;
import security.role.RoleView;
import security.user.UserView;

/**
 *
 * @author lespinoza
 */
public class AppController implements ActionListener {
    
    private final ModuleModel model;
    private final AppView view;
    private final User user;
    private final List<UserRight> rights;
    
    public AppController(AppView view, ModuleModel model, User user, List<UserRight> rights){
        this.view = view;
        this.model = model;
        this.user = user;
        this.rights = rights;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (model != null){
            List<Module> moduleList = model.getList(1);
            moduleList.stream().forEach((Module module) -> {
                Long moduleId = module.getId();
                String actionCommand = "Action_" + Long.toString(moduleId);
                if (ae.getActionCommand().equals(actionCommand)) {
                    executeModule(moduleId);
                }
            });
        }
    }
 
   private UserRight getModuleRights(Long moduleId){
        UserRight right = null;
        for (UserRight r: rights){
            if (r.getModule().getId() == moduleId){
                right = r;
                break;
            }
        }
        return right;
    }
    
    public void executeModule(Long moduleId){
        UserRight moduleRights = getModuleRights(moduleId);
        if (moduleId == 1){
                menuAction(moduleRights, user);
        } else if (moduleId == 2){
                moduleAction(moduleRights, user);
         } else if (moduleId == 3){
                roleAction(moduleRights, user);
         } else if (moduleId == 4){
                userAction(moduleRights, user);
         } else if (moduleId == 5){
                exitAction();
        } else if (moduleId == 6){
                aboutAction();
//
//            case 2010:
//                phaseAction(moduleRights, user);
//                break;
//            case 2030:
//                confederationAction(moduleRights, user);
//                break;
//            case 2040:
//                countryAction(moduleRights, user);
//                break;
//            case 2050:
//                associationAction(moduleRights, user);
//                break;
//            case 2060:
//                tournamentAction(moduleRights, user);
//                break;
//            case 2070:
//                teamAction(moduleRights, user);
//                break;
//            case 2080:
//                fixtureTypeAction(moduleRights, user);
//                break;
//            case 2090:
//                stadiumAction(moduleRights, user);
//                break;
//            case 2100:
//                refereeAction(moduleRights, user);
//                break;
//
//            case 3010:
//                importTeamAction(moduleRights, user);
//                break;
//            case 3020:
//                importFixtureAction(moduleRights, user);
//                break;
//            case 3030:
//                importScheduleAction(moduleRights, user);
//                break;
//
//            case 4010:
//                fixtureAction(moduleRights, user);
//                break;
//            case 4020:
//                resultsAction(moduleRights, user);
//                break;
//            case 4030:
//                analysisAction(moduleRights, user);
//                break;
//            case 4040:
//                simulationAction(moduleRights, user);
//                break;
//            case 4050:
//                importRawDataAction(moduleRights, user);
//                break;
//            case 4060:
//                importMaskDataAction(moduleRights, user);
//                break;
        } else {
            JOptionPane.showMessageDialog(view, "Module not identified", "Unkown", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void menuAction(UserRight rights, User user) {
        MenuView frm = new MenuView(user, rights);
        view.addFrame(frm);
        frm.setVisible(true);
    }
    
    private void moduleAction(UserRight rights, User user) {
        ModuleView frm = new ModuleView(user, rights);
        view.addFrame(frm);
        frm.setVisible(true);
    }
    
    private void roleAction(UserRight rights, User user) {
        RoleView frm = new RoleView(user, rights);
        view.addFrame(frm);
        frm.setVisible(true);
    }
    
    private void userAction(UserRight rights, User user) {
        UserView frm = new UserView(user, rights);
        view.addFrame(frm);
        frm.setVisible(true);
    }
    
    private void exitAction(){
        System.exit(0);
    }
    
    private void aboutAction() {
        AboutView frm = new AboutView();
        view.addFrame(frm);
        
        /**
         * Centers the about child windows
         */
        Dimension desktopSize = view.getSize();
        Dimension windowSize = frm.getSize();
        int width = (desktopSize.width - windowSize.width) / 2;
        int height = (desktopSize.height - windowSize.height) / 2;
        frm.setLocation(width, height);
        frm.setVisible(true);
    }

}
