package Class

class Extends {
    private lateinit var text1:String
    fun process(Gets:String){
        println("Hasilnya: $Gets")
        var z:CharArray = Gets.toCharArray()
        println(z.contentToString())
        println(z)
        var hasil:String = z.joinToString("")

        hasil=hasil.replace("\\s".toRegex(),"")
        val newstr = hasil.chunked(1).joinToString("-")
        println(newstr)
    }
  public fun process2(Gets: String){
        println("Hasilnya adalah : $Gets")
        val texs:CharArray = Gets.toCharArray()
        var result:String = texs.joinToString("")
        result=result.replace("\\s".toRegex(),"")
        val re = Regex("[^A-za-z0-9]")
        result= re.replace(result,"")
      val rext = arrayOf('a','i','u','e','o','A','I','U','E','O')
      val z = result.length/2
      println(z)
      if(result[z] in rext){ //kext
         var x = result.take(z)
          var v = result.drop(z+1)
          var o = result[z]
          println(o)
          println(x)
          println(v)
          if(z==3){
              if(result.length==7){
                  if(result[4] in rext){
                      val x = result.take(3)
                      var m = result.drop(4)
                      var h = result[3]
                      println(h)
                      m = m.chunked(3).joinToString("-")
                      println("the seventh 1")
                      println(x.plus("-").plus(h).plus("-").plus(m))
                  }else{
                      val x = result.take(3)
                      var m = result.drop(3)
                      m = m.chunked(2).joinToString("-")
                      println("the seventh")
                      println(x.plus("-").plus(m))
                  }

              }else{
                  x=x.chunked(3).joinToString("-")
                  v=v.chunked(2).joinToString("-")
                  println(x.plus("-").plus(o).plus("-").plus(v))
              }

          }else if(z==2){
              x=x.chunked(2).joinToString("-")
              v=v.chunked(2).joinToString("-")
              println(x.plus("-").plus(o).plus("-").plus(v))
          }
          else if(z==1){
              val x = result.take(2)
              val v = result.drop(2)
              println("thiss")
              println(x.plus("-").plus(v))
          }

      }else if(result[0] in rext){
          val x = result.take(3)
          val v = result.drop(3)
          println(x)
          println(v)
          println(x.plus("-").plus(v))
      }
     else if(result[0] !in rext && result[1] in rext || result[0] !in rext && result[1] !in rext){
          if(z==3){
              if(result.length==7){
                  val x = result.take(3)
                  var m = result.drop(3)
                  m = m.chunked(2).joinToString("-")
                  println("the seventh")
                  println(x.plus("-").plus(m))
              }
          }
        if(z==2){
            if(result.length==4) {
                val x = result.take(2)
                val v = result.drop(2)
                println("this")
                println(x.plus("-").plus(v))
            }
            else{
                val x = result.take(3)
                val v = result.drop(3)
                println("this")
                println(x.plus("-").plus(v))
            }

        }else if(z==1){
            if(result[1] !in rext){
                var x = result.dropLast(2)
                var v = result.drop(1)
                v = v.chunked(1).joinToString("-")
                println(x.plus("-").plus(v))
            }else{
                val x = result.take(2)
                val v = result.drop(2)
                println("this one")
                println(x.plus("-").plus(v))
            }

        }
      }


    }
}