package nimble_grails

import com.nimble.domain.view.ApplicationControl
import com.nimble.domain.reference.*
import com.nimble.utils.view.ViewHelper
import com.nimble.utils.domain.ReferenceHelper
import com.nimble.utils.file.FileHelper
import com.nimble.controller.view.ApplicationControlController
import com.nimble.controller.reference.ReferenceController
import com.nimble.controller.security.ApplicationSettingController

class BootStrap {

    def init = { servletContext ->
        //println '****************** Bootstap begin'

        // cache app control data
        def appController = new ApplicationControlController()
        appController.loadCache(servletContext)

        // cache ref data
        def refController = new ReferenceController()
        refController.loadCache(servletContext)

        // cache settings data
        def settingController = new ApplicationSettingController()
        settingController.loadCache(servletContext)

        //println '****************** Bootstap end'


    }
    def destroy = {
    }
}
