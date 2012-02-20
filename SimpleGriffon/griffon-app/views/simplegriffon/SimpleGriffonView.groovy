package simplegriffon

application(
	title: 'Simple Griffon Example', 
	pack: true) {
	panel {
    	borderLayout()
		label(constraints: "Center", text:"Griffon's SwingBuilder is decalarative!", font: new Font("Georgia", Font.PLAIN, 40))
	}
	
	doLater {
		def window = app.windowManager.getAt(0).setLocationRelativeTo(null)
	}
}

