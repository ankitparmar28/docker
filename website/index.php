<html>
  <body>
    <h1>Item names:</h1>
    <ul>
      <?php
	$json = utf8_encode(file_get_contents("http://items:8080/getItems"));
	$itemList = json_decode($json, true);
	foreach($itemList as $item) {
          echo "<li>$item</li>";
        }
      ?>
    </ul>
  </body>
</html>