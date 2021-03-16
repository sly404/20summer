/**
 * Theme: Highdmin - Responsive Bootstrap 4 Admin Dashboard
 * Author: Coderthemes
 * Chartist chart
 */

// import * as Chartist from "../../../plugins/chart.js/chart.bundle";

//smil-animations Chart


//Line chart with tooltips

var yearchart = new Chartist.Line('#line-chart-tooltips', {
	labels: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12'],
	series: [{
		name: 'Fibonacci sequence',
		data: [1, 2, 3, 5, 8, 13, 22, 14, 30, 12, 22, 26]
	}, ]
}, {
	plugins: [
		Chartist.plugins.tooltip()
	]
});

var $chart = $('#line-chart-tooltips');

var $toolTip = $chart
	.append('<div class="tooltip"></div>')
	.find('.tooltip')
	.hide();

$chart.on('mouseenter', '.ct-point', function() {
	var $point = $(this),
		value = $point.attr('ct:value'),
		seriesName = $point.parent().attr('ct:series-name');
	$toolTip.html(seriesName + '<br>' + value).show();
});

$chart.on('mouseleave', '.ct-point', function() {
	$toolTip.hide();
});

$chart.on('mousemove', function(event) {
	$toolTip.css({
		left: (event.offsetX || event.originalEvent.layerX) - $toolTip.width() / 2 - 10,
		top: (event.offsetY || event.originalEvent.layerY) - $toolTip.height() - 40
	});
});

// For the sake of the example we update the chart every time it's created with a delay of 8 seconds
$chart.on('created', function() {
	if (window.__anim21278907124) {
		clearTimeout(window.__anim21278907124);
		window.__anim21278907124 = null;
	}
	window.__anim21278907124 = setTimeout(chart.update.bind($chart), 10000);
});