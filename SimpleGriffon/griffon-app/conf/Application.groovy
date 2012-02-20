application {
    title = 'SimpleGriffon'
    startupGroups = ['simpleGriffon']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "simpleGriffon"
    'simpleGriffon' {
        model      = 'simplegriffon.SimpleGriffonModel'
        view       = 'simplegriffon.SimpleGriffonView'
        controller = 'simplegriffon.SimpleGriffonController'
    }

}
