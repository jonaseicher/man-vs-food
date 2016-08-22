new File("data/newfood.txt").withWriter { out ->
	new File("data/food.txt").withReader { reader ->
		def food = reader.eachLine { line ->
			line.split('\t').eachWithIndex { it, idx ->
				if (idx == 1) {
					if (it=="*") {
						out.print 27.77
					}
					if (it=="**") {
						out.print 67.77
					}
					if (it=="***") {
						out.print 87.77
					}
				} else if (idx == 2) {
					if (it=="*") {
						out.print 5.77
					}
					if (it=="**") {
						out.print 15.77
					}
					if (it=="***") {
						out.print 25.77
					}
				} else if (idx == 11) {
					if (it=="*") {
						out.print "gluten-free"
					}
					if (it=="**") {
						out.print "low-gluten"
					}
					if (it=="***") {
						out.print "gluten"
					}
				} else if (idx == 12) {
					if (it=="*") {
						out.print "lactose-free"
					}
					if (it=="**") {
						out.print "low-lactose"
					}
					if (it=="***") {
						out.print "lactose"
					}
				} else if (idx == 13) {
					if (it=="*") {
						out.print "fructose-free"
					}
					if (it=="**") {
						out.print "low-fructose"
					}
					if (it=="***") {
						out.print "fructose"
					}
				} else {
					out.print it
				}
				out.print "\t"
			}
		out.println ""
		}
	}
}


