listTextSelect = function(box, delimeter) {
	var buffer = [];

	var selectList = '';

	if (box != null) {
		var select = AUI().one(box);

		if (select) {
			var options = select.all('option');

			options.each(function(item, index, collection) {
				// var val = item.val();
				var val = item.get('text');

				if (val) {
					buffer.push(val);
				}
			});
		}

		if (buffer[0] != '.none') {
			selectList = buffer.join(delimeter || ',');
		}
	}

	return selectList;
};


